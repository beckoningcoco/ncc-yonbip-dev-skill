# |<<

**分摊条件 (wa_amocond / nc.vo.wa.amoscheme.AmoCondVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6317.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_amocond | 分摊条件主键 | pk_wa_amocond | char(20) | √ | 主键 (UFID) |
| 2 | formula | 分摊条件公式 | formula | varchar(2000) |  | 字符串 (String) |
| 3 | formulastr | 分摊条件 | formulastr | varchar(2000) |  | 字符串 (String) |
| 4 | pk_wa_item | 薪资项目主键 | pk_wa_item | varchar(20) |  | 薪资发放项目 (wa_classitem) |
| 5 | fratio | 分摊比例(%) | fratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | type | 分摊组织类型 | type | int |  | 整数 (Integer) |
| 7 | pk_amo_org | 分摊组织 | pk_amo_org | char(20) | √ | 组织 (org) |
| 8 | pk_amoscheme | 分摊方案主键 | pk_amoscheme | char(20) |  | 主键 (UFID) |
| 9 | priority | 优先级 | priority | int |  | 整数 (Integer) |
| 10 | itemkey | 薪资项目字段名 | itemkey | varchar(20) |  | 字符串 (String) |