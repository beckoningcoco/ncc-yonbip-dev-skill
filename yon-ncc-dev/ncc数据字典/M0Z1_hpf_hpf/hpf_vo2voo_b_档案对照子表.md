# |<<

**档案对照子表 (hpf_vo2voo_b / nc.vo.hpf.hpfc.docref.Vo2VoBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2651.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_interdocref_b | 子表主键 | pk_interdocref_b | char(20) | √ | 主键 (UFID) |
| 2 | mpk | 来源档案主键 | mpk | varchar(50) |  | 字符串 (String) |
| 3 | mcode | 来源档案编码 | mcode | varchar(50) |  | 字符串 (String) |
| 4 | mname | 来源档案名称 | mname | varchar(50) |  | 字符串 (String) |
| 5 | msyscode | 来源档案数据来源 | msyscode | varchar(20) |  | 数据来源系统设置 (EntryconfigVO) |
| 6 | hpk | 目的档案主键 | hpk | varchar(50) |  | 字符串 (String) |
| 7 | hcode | 目的档案编码 | hcode | varchar(50) |  | 字符串 (String) |
| 8 | hname | 目的档案名称 | hname | varchar(50) |  | 字符串 (String) |
| 9 | chargetype | 收费类型 | chargetype | int |  | 收费属性 (ChargeTypeEnum) |  | 0=门诊收入; |