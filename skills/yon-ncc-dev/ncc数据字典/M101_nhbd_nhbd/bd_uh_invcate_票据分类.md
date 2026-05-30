# |<<

**票据分类 (bd_uh_invcate / nc.vo.nhbd.price.InvCateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1044.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invcate | 主键 | pk_invcate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 分类编码 | code | varchar(50) | √ | 字符串 (String) |
| 5 | name | 分类名称 | name | varchar(50) | √ | 字符串 (String) |
| 6 | eu_invtype | 所属类型 | eu_invtype | int |  | 票据类型 (invctypeenum) |  | 0=患者发票; |