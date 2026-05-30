# |<<

**规则型入账设置 (fip_orgrule / nc.vo.fip.orgrule.OrgRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2244.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgrule | 对象标识 | pk_orgrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 来源组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | factorformula | 影响因素公式 | factorformula | varchar(2000) |  | 字符串 (String) |
| 5 | orgformula | 目标主组织公式 | orgformula | varchar(2000) |  | 字符串 (String) |
| 6 | src_billtype | 来源单据类型 | src_billtype | varchar(20) |  | 字符串 (String) |
| 7 | des_billtype | 目标单据类型 | des_billtype | varchar(20) |  | 字符串 (String) |
| 8 | sortindex | 排序编号 | sortindex | int |  | 整数 (Integer) |
| 9 | factor1 | 影响因素1 | factor1 | varchar(101) |  | 自定义项 (Custom) |
| 10 | factor2 | 影响因素2 | factor2 | varchar(101) |  | 自定义项 (Custom) |
| 11 | factor3 | 影响因素3 | factor3 | varchar(101) |  | 自定义项 (Custom) |