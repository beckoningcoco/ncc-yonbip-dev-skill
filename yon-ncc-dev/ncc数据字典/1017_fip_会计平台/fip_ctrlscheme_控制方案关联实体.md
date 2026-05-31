# |<<

**控制方案关联实体 (fip_ctrlscheme / nc.vo.fip.ctrl.ControlSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2229.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ctrlscheme | 对象标识 | pk_ctrlscheme | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | src_billtype | 来源单据 | src_billtype | varchar(20) |  | 字符串 (String) |
| 5 | des_billtype | 目标单据 | des_billtype | varchar(20) |  | 字符串 (String) |
| 6 | schemeid | 控制方案主键 | schemeid | varchar(101) |  | 字符串 (String) |