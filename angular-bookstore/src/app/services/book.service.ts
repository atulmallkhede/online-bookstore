import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Book } from '../common/book';
import { Category } from '../common/category';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseUrl = "http://192.168.0.110:9090/api/v1/books";
  private categoryUrl = "http://192.168.0.110:9090/api/v1/book-categories";

  constructor(private httpClient: HttpClient) { }

  getBooks(theCategoryId: number): Observable<Book[]> {
    const searchUrl = `${this.baseUrl}/search/category?id=${theCategoryId}`;
    return this.httpClient.get<GetResponseBooks>(searchUrl).pipe(
      map(response => response._embedded.books)
    );
  }

  getCategories(): Observable<Category[]> {
    return this.httpClient.get<GetResponseCategories>(this.categoryUrl).pipe(
      map(response => response._embedded.categories)
    );
  }
}


interface GetResponseBooks {
  _embedded: {
    books: Book[];
  }
}

interface GetResponseCategories {
  _embedded: {
    categories: Category[];
  }
}