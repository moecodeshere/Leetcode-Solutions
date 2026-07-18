# <img src="/api/placeholder/40/40" style="vertical-align: middle"> CharFrequency.java

<div align="center">
  <em>A powerful Java utility for character frequency analysis using HashMap</em>
  
  <br><br>
  
  <img src="/api/placeholder/800/250" alt="Character Frequency Analysis Banner">
  
  <br><br>
  
  <a href="#problem"><img src="/api/placeholder/100/28" alt="Problem"></a>&nbsp;&nbsp;
  <a href="#concepts"><img src="/api/placeholder/100/28" alt="Concepts"></a>&nbsp;&nbsp;
  <a href="#implementation"><img src="/api/placeholder/100/28" alt="Code"></a>&nbsp;&nbsp;
  <a href="#usage"><img src="/api/placeholder/100/28" alt="Usage"></a>&nbsp;&nbsp;
  <a href="#extensions"><img src="/api/placeholder/100/28" alt="Extensions"></a>
</div>

<br>

## <span style="color: #4285f4">🧠</span> Problem Statement

<div style="background: linear-gradient(135deg, #f8f9fa, #ffffff); border-radius: 12px; padding: 20px; margin: 20px 0; box-shadow: 0 3px 10px rgba(0,0,0,0.08); border-left: 4px solid #4285f4;">
  <h3 style="color: #4285f4; margin-top: 0;">Challenge</h3>
  <p>Given any string input, efficiently count the frequency of each character and store the results in a data structure that allows for fast lookups and iterations.</p>
  
  <div style="background: white; border-radius: 8px; padding: 15px; margin-top: 15px; box-shadow: 0 2px 5px rgba(0,0,0,0.05);">
    <strong>Input:</strong> <code style="background: #f1f3f4; padding: 2px 6px; border-radius: 3px;">String text</code><br>
    <strong>Output:</strong> <code style="background: #f1f3f4; padding: 2px 6px; border-radius: 3px;">Map&lt;Character, Integer&gt;</code><br>
    <strong>Time Complexity:</strong> <span style="color: #34a853; font-weight: bold;">O(n)</span><br>
    <strong>Space Complexity:</strong> <span style="color: #34a853; font-weight: bold;">O(k)</span> where k = unique characters
  </div>
</div>

## <span style="color: #34a853">🛠️</span> Key Concepts Covered

<div style="display: flex; flex-wrap: wrap; gap: 20px; margin: 20px 0;">
  <div style="flex: 1; min-width: 250px; background: linear-gradient(135deg, #ffffff, #f5f7fa); border-radius: 8px; padding: 18px; box-shadow: 0 4px 6px rgba(0,0,0,0.07); border-top: 3px solid #34a853;">
    <h3 style="color: #34a853; margin-top: 0; display: flex; align-items: center;">
      <img src="/api/placeholder/24/24" style="margin-right: 8px;"> HashMap Operations
    </h3>
    <ul style="color: #5f6368; margin-bottom: 0;">
      <li>Key-value pair storage</li>
      <li>O(1) average lookup time</li>
      <li>Dynamic sizing</li>
    </ul>
  </div>
  
  <div style="flex: 1; min-width: 250px; background: linear-gradient(135deg, #ffffff, #f5f7fa); border-radius: 8px; padding: 18px; box-shadow: 0 4px 6px rgba(0,0,0,0.07); border-top: 3px solid #fbbc04;">
    <h3 style="color: #fbbc04; margin-top: 0; display: flex; align-items: center;">
      <img src="/api/placeholder/24/24" style="margin-right: 8px;"> String Traversal
    </h3>
    <ul style="color: #5f6368; margin-bottom: 0;">
      <li><code>charAt(i)</code> indexing</li>
      <li>Character extraction</li>
      <li>Linear iteration</li>
    </ul>
  </div>
  
  <div style="flex: 1; min-width: 250px; background: linear-gradient(135deg, #ffffff, #f5f7fa); border-radius: 8px; padding: 18px; box-shadow: 0 4px 6px rgba(0,0,0,0.07); border-top: 3px solid #ea4335;">
    <h3 style="color: #ea4335; margin-top: 0; display: flex; align-items: center;">
      <img src="/api/placeholder/24/24" style="margin-right: 8px;"> Safe Operations
    </h3>
    <ul style="color: #5f6368; margin-bottom: 0;">
      <li><code>getOrDefault()</code> usage</li>
      <li>Null-safe lookups</li>
      <li>Default value handling</li>
    </ul>
  </div>
</div>

## <span style="color: #fbbc04">📊</span> Example Analysis

<div style="background: linear-gradient(135deg, #fffdf5, #ffffff); border-radius: 12px; padding: 20px; margin: 20px 0; box-shadow: 0 3px 10px rgba(0,0,0,0.08);">
  <div style="display: flex; flex-wrap: wrap; gap: 20px;">
    <div style="flex: 1; min-width: 280px;">
      <div style="background: white; border-radius: 8px; padding: 20px; box-shadow: 0 2px 5px rgba(0,0,0,0.05);">
        <h3 style="color: #fbbc04; margin-top: 0; display: flex; align-items: center;">
          <span style="background: #fbbc04; color: white; border-radius: 50%; width: 24px; height: 24px; display: flex; align-items: center; justify-content: center; margin-right: 10px; font-size: 14px; font-weight: bold;">1</span>
          Input String
        </h3>
        <div style="background: #f8f9fa; border-radius: 6px; padding: 15px; font-family: 'Consolas', monospace; font-size: 18px; text-align: center; letter-spacing: 2px; border: 2px dashed #fbbc04;">
          "banana"
        </div>
      </div>
    </div>
    
    <div style="flex: 1; min-width: 280px;">
      <div style="background: white; border-radius: 8px; padding: 20px; box-shadow: 0 2px 5px rgba(0,0,0,0.05);">
        <h3 style="color: #fbbc04; margin-top: 0; display: flex; align-items: center;">
          <span style="background: #fbbc04; color: white; border-radius: 50%; width: 24px; height: 24px; display: flex; align-items: center; justify-content: center; margin-right: 10px; font-size: 14px; font-weight: bold;">2</span>
          Character Frequency
        </h3>
        <div style="background: #f8f9fa; border-radius: 6px; padding: 15px; font-family: 'Consolas', monospace;">
          <div style="display: flex; justify-content: space-between; margin-bottom: 8px;"><span style="color: #4285f4;">'b'</span> <span style="background: #4285f4; color: white; padding: 2px 8px; border-radius: 12px; font-size: 12px;">1</span></div>
          <div style="display: flex; justify-content: space-between; margin-bottom: 8px;"><span style="color: #34a853;">'a'</span> <span style="background: #34a853; color: white; padding: 2px 8px; border-radius: 12px; font-size: 12px;">3</span></div>
          <div style="display: flex; justify-content: space-between;"><span style="color: #ea4335;">'n'</span> <span style="background: #ea4335; color: white; padding: 2px 8px; border-radius: 12px; font-size: 12px;">2</span></div>
        </div>
      </div>
    </div>
  </div>
  
  <div style="margin-top: 20px; padding: 15px; background: #f1f3f4; border-radius: 8px; text-align: center;">
    <strong>Result:</strong> <code style="background: white; padding: 8px 12px; border-radius: 6px; font-family: 'Consolas', monospace; box-shadow: 0 1px 3px rgba(0,0,0,0.1);">{a=3, b=1, n=2}</code>
  </div>
</div>

## <span style="color: #ea4335">🔍</span> Implementation Details

<div style="background: linear-gradient(135deg, #ffffff, #f8f9fa); border-radius: 12px; padding: 20px; margin: 20px 0; box-shadow: 0 3px 10px rgba(0,0,0,0.08);">
  <h3 style="color: #ea4335; margin-top: 0;">Core Algorithm</h3>
  
  <div style="background: #1a1a1a; border-radius: 8px; padding: 20px; margin: 15px 0; position: relative; overflow: hidden;">
    <div style="position: absolute; top: 0; left: 0; right: 0; height: 3px; background: linear-gradient(90deg, #4285f4, #34a853, #fbbc04, #ea4335);"></div>
    <pre style="color: #e8eaed; margin: 0; font-family: 'Consolas', monospace; line-height: 1.5;"><code><span style="color: #9aa0a6;">// Initialize frequency map</span>
<span style="color: #4fc3f7;">HashMap</span>&lt;<span style="color: #ffb74d;">Character</span>, <span style="color: #ffb74d;">Integer</span>&gt; map = <span style="color: #81c784;">new</span> <span style="color: #4fc3f7;">HashMap</span>&lt;&gt;();

<span style="color: #9aa0a6;">// Process each character</span>
<span style="color: #81c784;">for</span> (<span style="color: #ffb74d;">int</span> i = <span style="color: #f48fb1;">0</span>; i &lt; str.<span style="color: #4fc3f7;">length</span>(); i++) {
    <span style="color: #ffb74d;">char</span> ch = str.<span style="color: #4fc3f7;">charAt</span>(i);
    map.<span style="color: #4fc3f7;">put</span>(ch, map.<span style="color: #4fc3f7;">getOrDefault</span>(ch, <span style="color: #f48fb1;">0</span>) + <span style="color: #f48fb1;">1</span>);
}</code></pre>
  </div>
  
  <div style="display: flex; flex-wrap: wrap; gap: 15px; margin-top: 20px;">
    <div style="flex: 1; min-width: 200px; background: white; border-radius: 8px; padding: 15px; box-shadow: 0 2px 5px rgba(0,0,0,0.05);">
      <h4 style="color: #4285f4; margin: 0 0 10px 0;">Step 1</h4>
      <p style="color: #5f6368; margin: 0; font-size: 14px;"><code>charAt(i)</code> extracts each character sequentially</p>
    </div>
    
    <div style="flex: 1; min-width: 200px; background: white; border-radius: 8px; padding: 15px; box-shadow: 0 2px 5px rgba(0,0,0,0.05);">
      <h4 style="color: #34a853; margin: 0 0 10px 0;">Step 2</h4>
      <p style="color: #5f6368; margin: 0; font-size: 14px;"><code>getOrDefault()</code> safely retrieves current count or 0</p>
    </div>
    
    <div style="flex: 1; min-width: 200px; background: white; border-radius: 8px; padding: 15px; box-shadow: 0 2px 5px rgba(0,0,0,0.05);">
      <h4 style="color: #fbbc04; margin: 0 0 10px 0;">Step 3</h4>
      <p style="color: #5f6368; margin: 0; font-size: 14px;"><code>put()</code> updates the frequency count in the map</p>
    </div>
  </div>
</div>

## <span style="color: #4285f4">🚀</span> How to Run

<div style="background: linear-gradient(135deg, #f2f7ff, #ffffff); border-radius: 12px; padding: 20px; margin: 20px 0; box-shadow: 0 3px 10px rgba(0,0,0,0.08);">
  <div style="display: flex; flex-wrap: wrap; gap: 20px;">
    <div style="flex: 1; min-width: 200px;">
      <div style="background: white; border-radius: 8px; padding: 20px; box-shadow: 0 2px 5px rgba(0,0,0,0.05); text-align: center;">
        <img src="/api/placeholder/48/48" style="margin-bottom: 15px;">
        <h3 style="color: #4285f4; margin: 0 0 10px 0;">Compile</h3>
        <div style="background: #f8f9fa; border-radius: 6px; padding: 10px; font-family: 'Consolas', monospace; font-size: 14px;">
          javac CharFrequency.java
        </div>
      </div>
    </div>
    
    <div style="flex: 1; min-width: 200px;">
      <div style="background: white; border-radius: 8px; padding: 20px; box-shadow: 0 2px 5px rgba(0,0,0,0.05); text-align: center;">
        <img src="/api/placeholder/48/48" style="margin-bottom: 15px;">
        <h3 style="color: #34a853; margin: 0 0 10px 0;">Execute</h3>
        <div style="background: #f8f9fa; border-radius: 6px; padding: 10px; font-family: 'Consolas', monospace; font-size: 14px;">
          java CharFrequency
        </div>
      </div>
    </div>
    
    <div style="flex: 1; min-width: 200px;">
      <div style="background: white; border-radius: 8px; padding: 20px; box-shadow: 0 2px 5px rgba(0,0,0,0.05); text-align: center;">
        <img src="/api/placeholder/48/48" style="margin-bottom: 15px;">
        <h3 style="color: #fbbc04; margin: 0 0 10px 0;">Output</h3>
        <div style="background: #f8f9fa; border-radius: 6px; padding: 10px; font-family: 'Consolas', monospace; font-size: 14px;">
          {a=3, b=1, n=2}
        </div>
      </div>
    </div>
  </div>
</div>

## <span style="color: #34a853">✨</span> Possible Extensions

<div style="background: linear-gradient(135deg, #f3fff3, #ffffff); border-radius: 12px; padding: 20px; margin: 20px 0; box-shadow: 0 3px 10px rgba(0,0,0,0.08);">
  <div style="display: grid; grid-template-columns: repeat(auto-fit, minmax(280px, 1fr)); gap: 20px;">
    <div style="background: white; border-radius: 8px; padding: 20px; box-shadow: 0 2px 5px rgba(0,0,0,0.05); border-left: 4px solid #4285f4;">
      <h4 style="color: #4285f4; margin: 0 0 15px 0; display: flex; align-items: center;">
        <img src="/api/placeholder/24/24" style="margin-right: 8px;"> Character Filtering
      </h4>
      <p style="color: #5f6368; margin: 0;">Count only alphabetic characters, ignore digits, symbols, or whitespace</p>
      <div style="background: #f8f9fa; border-radius: 6px; padding: 8px; margin-top: 10px; font-family: 'Consolas', monospace; font-size: 12px;">
        Character.isLetter(ch)
      </div>
    </div>
    
    <div style="background: white; border-radius: 8px; padding: 20px; box-shadow: 0 2px 5px rgba(0,0,0,0.05); border-left: 4px solid #34a853;">
      <h4 style="color: #34a853; margin: 0 0 15px 0; display: flex; align-items: center;">
        <img src="/api/placeholder/24/24" style="margin-right: 8px;"> Case Insensitive
      </h4>
      <p style="color: #5f6368; margin: 0;">Convert to lowercase for unified counting across cases</p>
      <div style="background: #f8f9fa; border-radius: 6px; padding: 8px; margin-top: 10px; font-family: 'Consolas', monospace; font-size: 12px;">
        Character.toLowerCase(ch)
      </div>
    </div>
    
    <div style="background: white; border-radius: 8px; padding: 20px; box-shadow: 0 2px 5px rgba(0,0,0,0.05); border-left: 4px solid #fbbc04;">
      <h4 style="color: #fbbc04; margin: 0 0 15px 0; display: flex; align-items: center;">
        <img src="/api/placeholder/24/24" style="margin-right: 8px;"> Word Frequency
      </h4>
      <p style="color: #5f6368; margin: 0;">Extend to count word occurrences instead of characters</p>
      <div style="background: #f8f9fa; border-radius: 6px; padding: 8px; margin-top: 10px; font-family: 'Consolas', monospace; font-size: 12px;">
        str.split("\\s+")
      </div>
    </div>
    
    <div style="background: white; border-radius: 8px; padding: 20px; box-shadow: 0 2px 5px rgba(0,0,0,0.05); border-left: 4px solid #ea4335;">
      <h4 style="color: #ea4335; margin: 0 0 15px 0; display: flex; align-items: center;">
        <img src="/api/placeholder/24/24" style="margin-right: 8px;"> Find Maximum
      </h4>
      <p style="color: #5f6368; margin: 0;">Identify the most frequently occurring character</p>
      <div style="background: #f8f9fa; border-radius: 6px; padding: 8px; margin-top: 10px; font-family: 'Consolas', monospace; font-size: 12px;">
        Collections.max(map.values())
      </div>
    </div>
    
    <div style="background: white; border-radius: 8px; padding: 20px; box-shadow: 0 2px 5px rgba(0,0,0,0.05); border-left: 4px solid #9c27b0;">
      <h4 style="color: #9c27b0; margin: 0 0 15px 0; display: flex; align-items: center;">
        <img src="/api/placeholder/24/24" style="margin-right: 8px;"> Sorted Results
      </h4>
      <p style="color: #5f6368; margin: 0;">Sort frequencies by count or alphabetically</p>
      <div style="background: #f8f9fa; border-radius: 6px; padding: 8px; margin-top: 10px; font-family: 'Consolas', monospace; font-size: 12px;">
        TreeMap / Stream.sorted()
      </div>
    </div>
    
    <div style="background: white; border-radius: 8px; padding: 20px; box-shadow: 0 2px 5px rgba(0,0,0,0.05); border-left: 4px solid #ff5722;">
      <h4 style="color: #ff5722; margin: 0 0 15px 0; display: flex; align-items: center;">
        <img src="/api/placeholder/24/24" style="margin-right: 8px;"> Performance Stats
      </h4>
      <p style="color: #5f6368; margin: 0;">Add timing and memory usage analysis</p>
      <div style="background: #f8f9fa; border-radius: 6px; padding: 8px; margin-top: 10px; font-family: 'Consolas', monospace; font-size: 12px;">
        System.nanoTime()
      </div>
    </div>
  </div>
</div>

## <span style="color: #ea4335">📦</span> Dependencies & Requirements

<div style="background: linear-gradient(135deg, #fff5f5, #ffffff); border-radius: 12px; padding: 20px; margin: 20px 0; box-shadow: 0 3px 10px rgba(0,0,0,0.08);">
  <div style="display: flex; flex-wrap: wrap; gap: 20px; align-items: center;">
    <div style="flex: 1; min-width: 200px;">
      <h3 style="color: #ea4335; margin: 0 0 15px 0;">Requirements</h3>
      <ul style="color: #5f6368; margin: 0;">
        <li>Java 8 or higher</li>
        <li>No external libraries</li>
        <li>Uses <code>java.util.HashMap</code></li>
      </ul>
    </div>
    
    <div style="flex: 1; min-width: 200px; text-align: center;">
      <img src="/api/placeholder/100/100" alt="Java Logo" style="opacity: 0.8;">
    </div>
    
    <div style="flex: 1; min-width: 200px;">
      <h3 style="color: #ea4335; margin: 0 0 15px 0;">File Structure</h3>
      <div style="background: #f8f9fa; border-radius: 6px; padding: 15px; font-family: 'Consolas', monospace; font-size: 14px;">
        📁 project/<br>
        &nbsp;&nbsp;└── CharFrequency.java
      </div>
    </div>
  </div>
</div>

---

<div align="center" style="margin-top: 40px;">
  <img src="/api/placeholder/60/60" alt="Java Logo" style="margin-bottom: 20px;">
  <h3 style="color: #5f6368;">CharFrequency.java</h3>
  <p style="color: #5f6368; font-style: italic;">Simple, efficient character frequency analysis in Java</p>
  
  <div style="margin-top: 20px;">
    <a href="#" style="display: inline-block; background: #4285f4; color: white; padding: 10px 20px; border-radius: 6px; text-decoration: none; margin: 0 5px; font-weight: 500;">Download Code</a>
    <a href="#" style="display: inline-block; background: #34a853; color: white; padding: 10px 20px; border-radius: 6px; text-decoration: none; margin: 0 5px; font-weight: 500;">Run Online</a>
    <a href="#" style="display: inline-block; background: #fbbc04; color: white; padding: 10px 20px; border-radius: 6px; text-decoration: none; margin: 0 5px; font-weight: 500;">View Tutorial</a>
  </div>
</div>
