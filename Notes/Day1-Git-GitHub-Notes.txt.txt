# Git & GitHub Notes (Day 1)

## 1. What is Git?

**Definition:**
Git is a Version Control System (VCS) that tracks changes in source code and helps developers collaborate.

**Simple Meaning:**
Git project ki history save karta hai.

---

## 2. What is GitHub?

**Definition:**
GitHub is a cloud-based platform that stores Git repositories online.

**Simple Meaning:**
GitHub internet par code store karne ki website hai.

---

## 3. Difference between Git and GitHub

| Git                     | GitHub             |
| ----------------------- | ------------------ |
| Version Control Tool    | Cloud Platform     |
| Works on Local Computer | Stores Code Online |
| Tracks Changes          | Shares Projects    |

---

# Commands We Learned

## 1. Check Git Version

```bash
git --version
```

**Purpose:**
Check whether Git is installed.

---

## 2. Initialize Git Repository

```bash
git init
```

**Purpose:**
Creates a new Git repository.

**Simple Meaning:**
Git ko project track karne ke liye start karta hai.

---

## 3. Check Project Status

```bash
git status
```

**Purpose:**
Shows the current status of the repository.

**Simple Meaning:**
Project ki current condition batata hai.

---

## 4. Add Files

```bash
git add .
```

**Purpose:**
Adds all files to the staging area.

**Simple Meaning:**
Commit ke liye saari files ready karta hai.

---

## 5. Commit

```bash
git commit -m "Day 1 Java Basics Completed"
```

**Purpose:**
Saves a snapshot of the project.

**Simple Meaning:**
Project ka checkpoint save karta hai.

---

## 6. Rename Branch

```bash
git branch -M main
```

**Purpose:**
Changes branch name to main.

---

## 7. Connect GitHub Repository

```bash
git remote add origin https://github.com/USERNAME/Repository.git
```

**Purpose:**
Connects local project with GitHub.

---

## 8. Check Remote

```bash
git remote -v
```

**Purpose:**
Displays connected GitHub repository.

---

## 9. Upload Project

```bash
git push -u origin main
```

**Purpose:**
Uploads project to GitHub.

---

# Daily Workflow

Whenever you make changes:

```bash
git status
git add .
git commit -m "Your Message"
git push
```

---

# Interview Questions

### Q1. What is Git?

**Answer:**
Git is a distributed version control system used to track changes in source code.

---

### Q2. What is GitHub?

**Answer:**
GitHub is a cloud platform used to store and manage Git repositories online.

---

### Q3. What is the difference between Git and GitHub?

**Answer:**
Git is a version control system, while GitHub is a cloud platform that hosts Git repositories.

---

### Q4. What does git init do?

**Answer:**
It initializes a new Git repository by creating a hidden .git folder.

---

### Q5. What is git status?

**Answer:**
It shows the current state of the repository, including modified, staged, and untracked files.

---

### Q6. What is git add .?

**Answer:**
It adds all files from the current directory to the staging area.

---

### Q7. What is git commit?

**Answer:**
It saves a snapshot of the staged changes with a commit message.

---

### Q8. Why do we use commit messages?

**Answer:**
Commit messages describe what changes were made in the project.

---

### Q9. What is git push?

**Answer:**
It uploads local commits to the remote GitHub repository.

---

### Q10. What is a repository?

**Answer:**
A repository is a folder where Git stores the project and its history.

---

# Interview Keywords

* Version Control System (VCS)
* Repository
* Commit
* Staging Area
* Branch
* Remote Repository
* Local Repository
* Push
* GitHub
* Source Code

---

# Real-Life Flow

Create Project
↓
git init
↓
git status
↓
git add .
↓
git commit -m "message"
↓
git push

---

# Commands to Remember

```bash
git --version
git init
git status
git add .
git commit -m "message"
git branch -M main
git remote add origin <repository-url>
git remote -v
git push -u origin main
```
