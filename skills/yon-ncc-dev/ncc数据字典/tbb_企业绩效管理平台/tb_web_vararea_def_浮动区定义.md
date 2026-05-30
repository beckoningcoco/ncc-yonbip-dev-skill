# |<<

**浮动区定义 (tb_web_vararea_def / nc.vo.epm.book.web.WebVarAreaDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5748.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | pk_area | 区域pk | pk_area | varchar(20) | √ | 字符串 (String) |
| 3 | var_area_position | 浮动区位置信息 | var_area_position | varchar(20) | √ | 字符串 (String) |
| 4 | var_area_type | 浮动区类型 | var_area_type | char(2) | √ | 字符串 (String) |
| 5 | is_block | 是否为块浮动 | is_block | char(1) | √ | 布尔类型 (UFBoolean) |
| 6 | block_size | 块浮动行数或列数 | block_size | int |  | 整数 (Integer) | -1 |
| 7 | var_def_list | 浮动区行/列维度集合 | var_def_list | image |  | BLOB (BLOB) |
| 8 | pk_sheet | 页签主键 | pk_sheet | varchar(20) |  | 字符串 (String) |
| 9 | varsumtype | 浮动区汇总类型 | varsumtype | varchar(2) |  | 字符串 (String) |
| 10 | isautoexpandbydatacell | 多维数据自动加载 | isautoexpandbydatacell | varchar(2) |  | 字符串 (String) |
| 11 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 12 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 13 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 14 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 15 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 16 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 17 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 18 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 19 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 20 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 21 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 22 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 23 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 24 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 25 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 26 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 27 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 28 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 29 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 30 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |