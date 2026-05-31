# |<<

**序列号回退表 (sn_serialno_return / nc.vo.sn.snreturn.entity.SerialRtnNoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5377.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_serialno_return | 序列号回退表主键 | pk_serialno_return | char(20) | √ | 主键 (UFID) |
| 2 | pk_snflow | 序列号流水 | pk_snflow | varchar(20) |  | 序列号流水记录表 (snflow) |
| 3 | vrtnsn | 回退序列号 | vrtnsn | varchar(20) |  | 字符串 (String) |