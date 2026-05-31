# |<<

**变化状态页签 (pam_transi_b / nc.vo.am.transi.StatusAfterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4340.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transi_b | 主键 | pk_transi_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_status_before | 处理前状态主键 | pk_status_before | varchar(20) |  | 设备状态 (StatusVO) |
| 5 | rule_code | 规则编码 | rule_code | varchar(30) |  | 字符串 (String) |
| 6 | rule_name | 规则名称 | rule_name | varchar(80) |  | 字符串 (String) |
| 7 | rule_value | 处理后状态主键 | rule_value | varchar(20) |  | 设备状态 (StatusVO) |
| 8 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 9 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |