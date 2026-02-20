import { Component } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';

@Component({
  selector: 'app-appointments-management',
  standalone: true,
  imports: [MatCardModule, MatIconModule],
  template: `
    <h1>Terminverwaltung</h1>
    <mat-card>
      <mat-card-header>
        <mat-card-title>Termine verwalten</mat-card-title>
      </mat-card-header>
      <mat-card-content>
        <p>Planen und verwalten Sie Ihre Beratungstermine.</p>
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
export class AppointmentsManagementComponent {}
