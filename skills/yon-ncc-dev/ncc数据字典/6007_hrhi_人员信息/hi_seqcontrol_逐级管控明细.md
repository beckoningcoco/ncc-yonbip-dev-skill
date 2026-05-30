# |<<

**逐级管控明细 (hi_seqcontrol / nc.vo.hi.seqcontrol.SeqcontrolVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2604.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_seqcontrol | 主键 | pk_seqcontrol | char(20) | √ | 主键 (UFID) |
| 2 | function_node | 功能项 | function_node | varchar(20) |  | 功能项(自定义档案) (Defdoc-HRHI021_0xx) |
| 3 | org_infoitem | 组织信息项 | org_infoitem | varchar(20) |  | 组织信息项(自定义档案) (Defdoc-HRHI022_0xx) |
| 4 | org_scope | 组织范围 | org_scope | int |  | 组织范围 (seqcontrolorg) |  | 1=本级; |