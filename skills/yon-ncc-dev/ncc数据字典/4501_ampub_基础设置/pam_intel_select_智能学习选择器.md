# |<<

**智能学习选择器 (pam_intel_select / nc.vo.am.intelselect.IntelSelectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4267.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intelselect | 主键 | pk_intelselect | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | source | 源参照物 | source | varchar(50) |  | 字符串 (String) |
| 5 | target | 目标物 | target | varchar(50) |  | 字符串 (String) |
| 6 | mount | 匹配数量 | mount | int |  | 整数 (Integer) |
| 7 | select_type | 选择类型 | select_type | varchar(50) |  | 字符串 (String) |