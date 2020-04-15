import { Component, OnInit } from '@angular/core';
import { Category } from 'src/app/common/category';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {

  categories: Category[];

  constructor(private _bookService: BookService) { }

  ngOnInit(): void {
    this.listCategories();
  }

  listCategories() {
    this._bookService.getCategories().subscribe(
      data => this.categories = data
    );
  }

}
