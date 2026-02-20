import { Component } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';

@Component({
  selector: 'app-claims',
  standalone: true,
  imports: [MatCardModule, MatIconModule],
  template: `
    <h1>Schaeden</h1>
    <mat-card>
      <mat-card-header>
        <mat-card-title>Schadenmeldungen</mat-card-title>
      </mat-card-header>
      <mat-card-content>
        <p>Melden und verfolgen Sie Ihre Schadensfaelle hier.</p>
      </mat-card-content>
    </mat-card>
  `,
  styles: [`
    h1 {
      color: #333;
      margin-bottom: 16px;
    }

    mat-card {
      max-width: 800px;
    }
  `],
})
export class ClaimsComponent {}
