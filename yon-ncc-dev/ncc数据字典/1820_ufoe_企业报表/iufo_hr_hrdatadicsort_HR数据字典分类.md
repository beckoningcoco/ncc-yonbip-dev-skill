# |<<

**HR数据字典分类 (iufo_hr_hrdatadicsort / nc.vo.iufo.hr.hrdatadic.HRDataDicSortVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3457.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hrdatadicsort | 分类主键 | pk_hrdatadicsort | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | pk_parent | 分类上级主键 | pk_parent | varchar(50) |  | 字符串 (String) |
| 5 | resmodule | 多语目录 | resmodule | varchar(50) |  | 字符串 (String) |
| 6 | resid | 多语id | resid | varchar(50) |  | 字符串 (String) |
| 7 | meta_id | 元数据id | meta_id | varchar(50) |  | 字符串 (String) |
| 8 | showorder | 显示顺序 | showorder | int |  | 整数 (Integer) |
| 9 | pk_org | 所属组织 | pk_org | char(20) |  | 主键 (UFID) |
| 10 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |