import React, { useState } from 'react'
//import {Link} from "react-router-dom"
// import 'bootstrap/dist/css/bootstrap.min.css';
import { Button } from 'react-bootstrap';
import Book from './Book';
import "./Home.css";
/*import background from "./Images/capture.png";*/





function Home() {
  const [data, setData] = useState(Book);
  const filterResult = (item) => {
    const result = Book.filter((curData) => {
      return curData.City === item;

    });
    setData(result)
  }

  return (
    <>
      <div>
        <h1 className='text-centertext-info'>"Welcome To The Book Shop!!!"</h1>
        <div className='container-fluid mx-2'>
          <div className='row mt-5 mx-2'>
            <div className='col-md-3'>
              <Button className="btn btn-warning w-100 mb-4" onClick={() => setData(Book)}>All</Button>
              <Button className="btn btn-warning w-100 mb-4" onClick={() => filterResult('Chennai')}>Chennai</Button>
              <Button className="btn btn-warning w-100 mb-4" onClick={() => filterResult('Madurai')}>Madurai</Button>
              <Button className="btn btn-warning w-100 mb-4" onClick={() => filterResult('Salem')}>Salem</Button>
              <Button className="btn btn-warning w-100 mb-4" onClick={() => filterResult('Tuticorn')}>Tuticorn</Button>
              <Button className="btn btn-warning w-100 mb-2" onClick={() => filterResult('Comics')}>Comics</Button>

            </div>
            <div className='col-md-9'>
              <div className='row'>
                {data.map((values) => {
                  const { id, title, price, Image, About } = values;
                  return (
                    <>
                      <div className='col-md-4 mb-4' key={id}>
                        <div class="card" >
                          <img src={Image} class="card-img-top" alt="..." />
                          <div class="card-body">
                            <h5 class="card-title" >{title}</h5>
                            <p>Price:{price}</p>
                            <p class="card-text">About: {About}</p>
                            <a href="#" class="btn btn-primary">Buy Now</a>
                          </div>
                        </div>
                      </div>

                    </>
                  )
                })}

                {/* <div className='col-md-4'>
                  <div class="card" >
                    <img src="./Images/home3 1.png" class="card-img-top" alt="..." />
                    <div class="card-body">
                      <h5 class="card-title">Wings Of Fire</h5>
                      <p>Price: 499/-</p>
                      <p class="card-text">About:This book is the autobiography of Dr. A.P.J Abdul kalam. There is so much knowledge and good things that everybody can extract from this book. Reading this book is very heartwarming.</p>
                      <a href="#" class="btn btn-primary">Buy Now</a>
                    </div>
                  </div>
                </div>
                <div className='col-md-4'>
                  <div class="card" >
                    <img src="./Images/home4 1.png" class="card-img-top" alt="..." />
                    <div class="card-body">
                      <h5 class="card-title">Card title</h5>
                      <p>Price: 159/-</p>
                      <p class="card-text">About:The Conjuring completes a modern supernatural horror film trifecta started with Wan's own Insidious in 2010 and bridged by last year's unsettling Sinister. With these films the genre has proved that this far from a dead.</p>
                      <a href="#" class="btn btn-primary">Go somewhere</a>
                    </div>
                  </div>
                </div>
                <div className='col-md-4'>
                  <div class="card" >
                    <img src="./Images/home1 1.png" class="card-img-top" alt="..." />
                    <div class="card-body">
                      <h5 class="card-title">Conjuring</h5>
                      <p>Price: 399/-
                      </p>
                      <p class="card-text">About:</p>
                      <a href="#" class="btn btn-primary">Buy Now</a>
                    </div>
                  </div>
                       
                </div>*/}
              </div>
            </div>
          </div>
        </div>
      </div>




    </>
  );
}

export default Home