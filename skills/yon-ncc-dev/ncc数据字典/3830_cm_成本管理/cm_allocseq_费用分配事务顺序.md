# |<<

**费用分配事务顺序 (cm_allocseq / nc.vo.cm.allocate.entity.AllocateSequenceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1447.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | callocseqid | 主键 | callocseqid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 工厂最新版本 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_org_v | 工厂 | pk_org_v | char(20) |  | 主键 (UFID) |
| 5 | callocdefid | 分配事务定义 | callocdefid | varchar(20) |  | 分配事务定义 (cm_allocdef) |
| 6 | nseq | 顺序号 | nseq | int |  | 整数 (Integer) |
| 7 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |