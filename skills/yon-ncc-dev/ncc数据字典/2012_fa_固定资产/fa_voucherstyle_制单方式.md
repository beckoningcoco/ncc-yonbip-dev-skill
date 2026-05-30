# |<<

**制单方式 (fa_voucherstyle / nc.vo.fa.option.VoucherstyleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2073.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucherstyle | 主键 | pk_voucherstyle | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_accbook | 账簿 | pk_accbook | varchar(20) |  | 字符串 (String) |
| 4 | voucherstyle_name | 制单方式名称 | voucherstyle_name | varchar(50) |  | 字符串 (String) |
| 5 | voucherstyle_value | 制单方式值 | voucherstyle_value | varchar(50) |  | 字符串 (String) |
| 6 | voucherstyle_level | 制单方式级次 | voucherstyle_level | int |  | 整数 (Integer) |