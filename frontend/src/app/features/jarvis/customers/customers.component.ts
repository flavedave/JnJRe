import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { MatTableModule } from '@angular/material/table';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';

interface Customer {
  name: string;
  email: string;
  telefon: string;
  stadt: string;
}

@Component({
  selector: 'app-customers',
  standalone: true,
  imports: [CommonModule, MatCardModule, MatTableModule, MatButtonModule, MatIconModule],
  template: `
    <h1>Kundenverwaltung</h1>
    <mat-card>
      <mat-card-header>
        <mat-card-title>Kundenliste</mat-card-title>
      </mat-card-header>
      <mat-card-content>
        <table mat-table [dataSource]="customers" class="full-width">
          <ng-container matColumnDef="name">
            <th mat-header-cell *matHeaderCellDef>Name</th>
            <td mat-cell *matCellDef="let customer">{{ customer.name }}</td>
          </ng-container>

          <ng-container matColumnDef="email">
            <th mat-header-cell *matHeaderCellDef>Email</th>
            <td mat-cell *matCellDef="let customer">{{ customer.email }}</td>
          </ng-container>

          <ng-container matColumnDef="telefon">
            <th mat-header-cell *matHeaderCellDef>Telefon</th>
            <td mat-cell *matCellDef="let customer">{{ customer.telefon }}</td>
          </ng-container>

          <ng-container matColumnDef="stadt">
            <th mat-header-cell *matHeaderCellDef>Stadt</th>
            <td mat-cell *matCellDef="let customer">{{ customer.stadt }}</td>
          </ng-container>

          <ng-container matColumnDef="aktionen">
            <th mat-header-cell *matHeaderCellDef>Aktionen</th>
            <td mat-cell *matCellDef="let customer">
              <button mat-icon-button color="primary">
                <mat-icon>edit</mat-icon>
              </button>
              <button mat-icon-button color="primary">
                <mat-icon>visibility</mat-icon>
              </button>
            </td>
          </ng-container>

          <tr mat-header-row *matHeaderRowDef="displayedColumns"></tr>
          <tr mat-row *matRowDef="let row; columns: displayedColumns;"></tr>
        </table>
      </mat-card-content>
    </mat-card>
  `,
  styles: [`
    h1 {
      color: #333;
      margin-bottom: 16px;
    }

    .full-width {
      width: 100%;
    }

    mat-card {
      overflow: auto;
    }
  `],
})
export class CustomersComponent {
  displayedColumns: string[] = ['name', 'email', 'telefon', 'stadt', 'aktionen'];

  customers: Customer[] = [
    { name: 'Max Mustermann', email: 'max@beispiel.de', telefon: '+49 171 1234567', stadt: 'Berlin' },
    { name: 'Erika Musterfrau', email: 'erika@beispiel.de', telefon: '+49 172 2345678', stadt: 'Muenchen' },
    { name: 'Hans Schmidt', email: 'hans@beispiel.de', telefon: '+49 173 3456789', stadt: 'Hamburg' },
    { name: 'Anna Weber', email: 'anna@beispiel.de', telefon: '+49 174 4567890', stadt: 'Koeln' },
    { name: 'Peter Mueller', email: 'peter@beispiel.de', telefon: '+49 175 5678901', stadt: 'Frankfurt' },
  ];
}
