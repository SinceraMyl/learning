using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace testp3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            int age = Convert.ToInt16(button1.Text);
            if (age < 18)
                label1.Text = "该生未成年";
            else
                label1.Text = "该生已成年";
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            
        }
    }
}
