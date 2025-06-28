variable "aws_region" {
  description = "AWS region to deploy to"
  default     = "us-east-1"
}

variable "app_name" {
  description = "Name of the application"
  default     = "11plus-service"
}

variable "vpc_cidr" {
  description = "CIDR block for the VPC"
  default     = "10.0.0.0/16"
}

variable "public_subnet_cidrs" {
  description = "List of public subnet CIDRs"
  type        = list(string)
  default     = ["10.0.1.0/24", "10.0.2.0/24"]
}

variable "container_port" {
  description = "Port the container listens on"
  default     = 5001
}

