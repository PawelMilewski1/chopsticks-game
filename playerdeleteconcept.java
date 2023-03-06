private static final String DELETE_BY_ID = "DELETE player_id a, player_name b, password c, " +
            "total_games d FROM player WHERE player_id=?";

public Player deleteById(long id) {
        Player user = new Player();
        System.out.println(DELETE_BY_ID);
        try(PreparedStatement statement = this.connection.prepareStatement(DELETE_BY_ID);) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                user.setPlayerId(rs.getLong("a"));
                user.setPlayerName(rs.getString("b"));
                user.setPassword(rs.getString("c"));
                user.setTotalGames(rs.getInt("d"));
            }
        } catch(SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return user;
    }
