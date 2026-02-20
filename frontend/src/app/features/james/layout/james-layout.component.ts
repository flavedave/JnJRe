import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet, RouterLink, RouterLinkActive } from '@angular/router';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatListModule } from '@angular/material/list';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';

import { AuthService } from '../../../core/services/auth.service';

@Component({
  selector: 'app-james-layout',
  standalone: true,
  imports: [
    CommonModule,
    RouterOutlet,
    RouterLink,
    RouterLinkActive,
    MatSidenavModule,
    MatToolbarModule,
    MatListModule,
    MatIconModule,
    MatButtonModule,
  ],
  template: `
    <mat-sidenav-container class="sidenav-container">
      <mat-sidenav mode="side" opened class="sidenav">
        <mat-toolbar color="accent">
          <span>James</span>
        </mat-toolbar>
        <mat-nav-list>
          <a mat-list-item routerLink="dashboard" routerLinkActive="active-link">
            <mat-icon matListItemIcon>dashboard</mat-icon>
            <span matListItemTitle>Dashboard</span>
          </a>
          <a mat-list-item routerLink="contracts" routerLinkActive="active-link">
            <mat-icon matListItemIcon>description</mat-icon>
            <span matListItemTitle>Meine Vertraege</span>
          </a>
          <a mat-list-item routerLink="appointments" routerLinkActive="active-link">
            <mat-icon matListItemIcon>event</mat-icon>
            <span matListItemTitle>Termine</span>
          </a>
          <a mat-list-item routerLink="chat" routerLinkActive="active-link">
            <mat-icon matListItemIcon>chat</mat-icon>
            <span matListItemTitle>KI-Assistent</span>
          </a>
          <a mat-list-item routerLink="claims" routerLinkActive="active-link">
            <mat-icon matListItemIcon>report_problem</mat-icon>
            <span matListItemTitle>Schaeden</span>
          </a>
          <a mat-list-item routerLink="documents" routerLinkActive="active-link">
            <mat-icon matListItemIcon>folder</mat-icon>
            <span matListItemTitle>Dokumente</span>
          </a>
        </mat-nav-list>
      </mat-sidenav>

      <mat-sidenav-content>
        <mat-toolbar color="accent">
          <span>James - Kundenportal</span>
          <span class="spacer"></span>
          <button mat-icon-button (click)="logout()">
            <mat-icon>logout</mat-icon>
          </button>
        </mat-toolbar>
        <div class="content">
          <router-outlet />
        </div>
      </mat-sidenav-content>
    </mat-sidenav-container>
  `,
  styles: [`
    .sidenav-container {
      height: 100vh;
    }

    .sidenav {
      width: 260px;
    }

    .content {
      padding: 24px;
    }

    .spacer {
      flex: 1 1 auto;
    }

    .active-link {
      background-color: rgba(0, 0, 0, 0.04);
    }
  `],
})
export class JamesLayoutComponent {
  constructor(private authService: AuthService) {}

  logout(): void {
    this.authService.logout();
  }
}
