import { Component } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';

@Component({
  selector: 'app-contracts-management',
  standalone: true,
  imports: [MatCardModule, MatIconModule],
  template: `
    <h1>Vertragsmanagement</h1>
    <mat-card>
      <mat-card-header>
        <mat-card-title>Vertraege verwalten</mat-card-title>
      </mat-card-header>
      <mat-card-content>
        <p>Verwalten Sie alle Kundenvertraege an einem zentralen Ort.</p>
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
export class ContractsManagementComponent {}
