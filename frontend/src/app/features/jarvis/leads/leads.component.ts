import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { MatTableModule } from '@angular/material/table';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatChipsModule } from '@angular/material/chips';

interface Lead {
  name: string;
  quelle: string;
  status: string;
  prioritaet: string;
  naechsterKontakt: string;
}

@Component({
  selector: 'app-leads',
  standalone: true,
  imports: [CommonModule, MatCardModule, MatTableModule, MatButtonModule, MatIconModule, MatChipsModule],
  template: `
    <h1>Lead-Verwaltung</h1>
    <mat-card>
      <mat-card-header>
        <mat-card-title>Leads</mat-card-title>
      </mat-card-header>
      <mat-card-content>
        <table mat-table [dataSource]="leads" class="full-width">
          <ng-container matColumnDef="name">
            <th mat-header-cell *matHeaderCellDef>Name</th>
            <td mat-cell *matCellDef="let lead">{{ lead.name }}</td>
          </ng-container>

          <ng-container matColumnDef="quelle">
            <th mat-header-cell *matHeaderCellDef>Quelle</th>
            <td mat-cell *matCellDef="let lead">{{ lead.quelle }}</td>
          </ng-container>

          <ng-container matColumnDef="status">
            <th mat-header-cell *matHeaderCellDef>Status</th>
            <td mat-cell *matCellDef="let lead">
              <mat-chip-set>
                <mat-chip [highlighted]="lead.status === 'Neu'">{{ lead.status }}</mat-chip>
              </mat-chip-set>
            </td>
          </ng-container>

          <ng-container matColumnDef="prioritaet">
            <th mat-header-cell *matHeaderCellDef>Prioritaet</th>
            <td mat-cell *matCellDef="let lead">{{ lead.prioritaet }}</td>
          </ng-container>

          <ng-container matColumnDef="naechsterKontakt">
            <th mat-header-cell *matHeaderCellDef>Naechster Kontakt</th>
            <td mat-cell *matCellDef="let lead">{{ lead.naechsterKontakt }}</td>
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
export class LeadsComponent {
  displayedColumns: string[] = ['name', 'quelle', 'status', 'prioritaet', 'naechsterKontakt'];

  leads: Lead[] = [
    { name: 'Thomas Braun', quelle: 'Website', status: 'Neu', prioritaet: 'Hoch', naechsterKontakt: '21.02.2026' },
    { name: 'Sarah Klein', quelle: 'Empfehlung', status: 'Kontaktiert', prioritaet: 'Mittel', naechsterKontakt: '22.02.2026' },
    { name: 'Michael Gross', quelle: 'Messe', status: 'Qualifiziert', prioritaet: 'Hoch', naechsterKontakt: '23.02.2026' },
    { name: 'Lisa Hoffmann', quelle: 'Telefon', status: 'Neu', prioritaet: 'Niedrig', naechsterKontakt: '25.02.2026' },
    { name: 'Frank Wagner', quelle: 'Partner', status: 'In Bearbeitung', prioritaet: 'Mittel', naechsterKontakt: '24.02.2026' },
  ];
}
