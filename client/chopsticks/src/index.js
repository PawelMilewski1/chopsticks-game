import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import { About, Contact } from "./App";
import App from "./Appchopsticks";
import {
    BrowserRouter,
    Routes,
    Route
} from "react-router-dom";


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <BrowserRouter>
        <Routes>
            <Route path="/" element={<App />} />
            <Route path="/about" element={<About />} />
            <Route
                path="/contact"
                element={<Contact />}
            />
        </Routes>
    </BrowserRouter>,
);
