# |<<

**多维图表额外基本信息表 (epa_dimgraph / nc.vo.epa.query.graph.DimGraphBaseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1859.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | pk_graph | pk_graph | pk_graph | char(20) | √ | 主键 (UFID) |
| 3 | hyperlink | hyperlink | hyperlink | image |  | BLOB (BLOB) |
| 4 | color | 图例颜色 | color | varchar(1000) |  | 字符串 (String) |
| 5 | fixedid | 图例位置 | fixedid | varchar(50) |  | 字符串 (String) |
| 6 | show | 图例是否显示 | show | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | themecolor | 主题颜色 | themecolor | varchar(50) |  | 字符串 (String) |
| 8 | themesize | 主题字体大小 | themesize | varchar(50) |  | 字符串 (String) |
| 9 | themefontfamily | 主题字体 | themefontfamily | varchar(50) |  | 字符串 (String) |
| 10 | themetextalign | 主题位置 | themetextalign | varchar(50) |  | 字符串 (String) |
| 11 | themeshow | 主题是否显示 | themeshow | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | yaiscommon | 指标通用属性 | yaiscommon | varchar(1000) |  | 字符串 (String) |
| 13 | issupportdrill | 是否支持钻取 | issupportdrill | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | drilldef | 钻取维度 | drilldef | char(20) |  | 主键 (UFID) |
| 15 | chartorder | 排序属性 | chartorder | varchar(1000) |  | 字符串 (String) |
| 16 | datasourcetype | 数据开源类型 | datasourcetype | varchar(50) |  | 字符串 (String) |
| 17 | cubecode | cubecode | cubecode | varchar(50) |  | 字符串 (String) |
| 18 | cubedisplay | cubeDisplay | cubedisplay | varchar(100) |  | 字符串 (String) |
| 19 | def5 | def5 | def5 | varchar(50) |  | 字符串 (String) |
| 20 | def4 | def4 | def4 | varchar(50) |  | 字符串 (String) |
| 21 | def3 | def3 | def3 | varchar(50) |  | 字符串 (String) |
| 22 | def2 | def2 | def2 | varchar(50) |  | 字符串 (String) |
| 23 | def1 | def1 | def1 | varchar(50) |  | 字符串 (String) |