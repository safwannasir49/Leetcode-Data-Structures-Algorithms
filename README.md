# Leetcode

<a href="https://leetcode.com/u/safwannasir49/"><img src="https://camo.githubusercontent.com/3b96a90f6d2de98fae0b33562086ee22e63337b7be297e6bb88fcf404d5deec4/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f636f6d6d6f6e732f7468756d622f302f30612f4c656574436f64655f4c6f676f5f626c61636b5f776974685f746578742e7376672f3132383070782d4c656574436f64655f4c6f676f5f626c61636b5f776974685f746578742e7376672e706e67" alt="LeetCode Logo | Safwan Nasir Profile" width="450" style="max-width: 100%;"></a>

LeetCode | Practice, Tutorials & Interview Preparation Solutions
This repository consists of solutions to LeetCode practice, tutorials, and interview preparation problems with Python, SQL, C++, and Java.

# My Leetcode Profile

<a href="https://leetcode.com/u/safwannasir49">
  <img src="https://github.com/safwannasir49/Hackerrank/assets/127377148/eb1d3279-c4ff-4e49-80c8-fa251e75433b" alt="Profile Icon" style="width: 50px; height: 50px;">
</a> 
<!--header-->
<table>
  <tr><td colspan="2"><a href="/README.md#-plugins">← Back to plugins index</a></td></tr>
  <tr><th colspan="2"><h3>🗳️ Leetcode</h3></th></tr>
  <tr><td colspan="2" align="center"><p>This plugin displays statistics from a <a href="https://leetcode.com">LeetCode</a> account.</p>
</td></tr>
  <tr><th>⚠️ Disclaimer</th><td><p>This plugin is not affiliated, associated, authorized, endorsed by, or in any way officially connected with <a href="https://leetcode.com">LeetCode</a>.
All product and company names are trademarks™ or registered® trademarks of their respective holders.</p>
</td></tr>
  <tr>
    <th rowspan="3">Supported features<br><sub><a href="metadata.yml">→ Full specification</a></sub></th>
    <td><a href="/source/templates/classic/README.md"><code>📗 Classic template</code></a></td>
  </tr>
  <tr>
    <td><code>👤 Users</code></td>
  </tr>
  <tr>
    <td><i>No tokens are required for this plugin</i></td>
  </tr>
  <tr>
    <td colspan="2" align="center">
      <img src="https://github.com/lowlighter/metrics/blob/examples/metrics.plugin.leetcode.svg" alt=""></img>
      <img width="900" height="1" alt="">
    </td>
  </tr>
</table>
<!--/header-->

## ➡️ Available options

<!--options-->
<table>
  <tr>
    <td align="center" nowrap="nowrap">Option</i></td><td align="center" nowrap="nowrap">Description</td>
  </tr>
  <tr>
    <td nowrap="nowrap"><h4><code>plugin_leetcode</code></h4></td>
    <td rowspan="2"><p>Enable leetcode plugin</p>
<img width="900" height="1" alt=""></td>
  </tr>
  <tr>
    <td nowrap="nowrap"><b>type:</b> <code>boolean</code>
<br>
<b>default:</b> no<br></td>
  </tr>
  <tr>
    <td nowrap="nowrap"><h4><code>plugin_leetcode_user</code></h4></td>
    <td rowspan="2"><p>LeetCode login</p>
<img width="900" height="1" alt=""></td>
  </tr>
  <tr>
    <td nowrap="nowrap">⏯️ Cannot be preset<br>
<b>type:</b> <code>string</code>
<br>
<b>default:</b> <code>→ User login</code><br></td>
  </tr>
  <tr>
    <td nowrap="nowrap"><h4><code>plugin_leetcode_sections</code></h4></td>
    <td rowspan="2"><p>Displayed sections</p>
<ul>
<li><code>solved</code> will display solved problems scores</li>
<li><code>skills</code> will display solved problems tagged skills</li>
<li><code>recent</code> will display recent submissions</li>
</ul>
<img width="900" height="1" alt=""></td>
  </tr>
  <tr>
    <td nowrap="nowrap"><b>type:</b> <code>array</code>
<i>(comma-separated)</i>
<br>
<b>default:</b> solved<br>
<b>allowed values:</b><ul><li>solved</li><li>skills</li><li>recent</li></ul></td>
  </tr>
  <tr>
    <td nowrap="nowrap"><h4><code>plugin_leetcode_limit_skills</code></h4></td>
    <td rowspan="2"><p>Display limit (skills)</p>
<img width="900" height="1" alt=""></td>
  </tr>
  <tr>
    <td nowrap="nowrap"><b>type:</b> <code>number</code>
<i>(0 ≤
𝑥)</i>
<br>
<b>zero behaviour:</b> disable</br>
<b>default:</b> 10<br></td>
  </tr>
  <tr>
    <td nowrap="nowrap"><h4><code>plugin_leetcode_ignored_skills</code></h4></td>
    <td rowspan="2"><p>Ignored skills</p>
<p>It is possible to ignore entires categories by passing <code>fundamental</code>, <code>intermediate</code> or <code>advanced</code></p>
<img width="900" height="1" alt=""></td>
  </tr>
  <tr>
    <td nowrap="nowrap"><b>type:</b> <code>array</code>
<br></td>
  </tr>
  <tr>
    <td nowrap="nowrap"><h4><code>plugin_leetcode_limit_recent</code></h4></td>
    <td rowspan="2"><p>Display limit (recent)</p>
<img width="900" height="1" alt=""></td>
  </tr>
  <tr>
    <td nowrap="nowrap"><b>type:</b> <code>number</code>
<i>(1 ≤
𝑥
≤ 15)</i>
<br>
<b>default:</b> 2<br></td>
  </tr>
</table>
<!--/options-->

## ℹ️ Examples workflows

<!--examples-->
```
name: LeetCode
uses: lowlighter/metrics@latest
with:
  filename: metrics.plugin.leetcode.svg
  token: NOT_NEEDED
  base: ""
  plugin_leetcode: yes
  plugin_leetcode_sections: solved, skills, recent

<!--/examples-->
