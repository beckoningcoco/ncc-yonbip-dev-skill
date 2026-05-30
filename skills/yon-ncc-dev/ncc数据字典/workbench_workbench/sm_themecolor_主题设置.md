# |<<

**主题设置 (sm_themecolor / nc.vo.platform.workbench.model.ThemeColorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5352.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_themecolor | 主键 | pk_themecolor | char(20) | √ | 主键 (UFID) |
| 2 | color | 颜色 | color | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | defaultshow | 默认展示 | defaultshow | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 5 | checked | 是否选中 | checked | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | userid | 用户主键 | userid | varchar(50) |  | 字符串 (String) |
| 7 | icon | 图标类型 | icon | varchar(50) |  | 字符串 (String) |
| 8 | tabletype | 表格类型 | tabletype | varchar(50) |  | 字符串 (String) |
| 9 | crosscheck | 斑马线 | crosscheck | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | cuttingcheck | 分割线 | cuttingcheck | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | fontsize | 字体 | fontsize | varchar(50) |  | 字体枚举 (enum) |  | small=小; |