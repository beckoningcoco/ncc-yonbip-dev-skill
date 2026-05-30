# |<<

**资产类别 (fa_category / nc.vo.fa.category.CategoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2001.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_category | 主键 | pk_category | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | cate_code | 类别编码 | cate_code | varchar(40) |  | 字符串 (String) |
| 5 | cate_name | 类别名称 | cate_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 6 | innercode | 内部编码 | innercode | varchar(60) |  | 字符串 (String) |
| 7 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | transi_type | 交易类型编码 | transi_type | varchar(40) |  | 字符串 (String) |
| 9 | pk_parent | 父节点标识 | pk_parent | varchar(20) |  | 字符串 (String) |
| 10 | catelevel | 编码级次 | catelevel | int |  | 整数 (Integer) |
| 11 | depattr | 计提属性 | depattr | varchar(50) |  | 计提属性 (deptrr) |  | 0=总提折旧; |