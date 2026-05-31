# |<<

**分配事务执行状态 (cm_allocstatus / nc.vo.cm.allocate.entity.AllocateStatusVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1448.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | callocstatusid | 分配事务执行状态 | callocstatusid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | bexcute | 是否执行 | bexcute | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | nseq | 顺序 | nseq | int |  | 整数 (Integer) |
| 8 | callocdefid | 分配事务 | callocdefid | varchar(20) |  | 分配事务定义 (cm_allocdef) |
| 9 | fstatus | 执行状态 | fstatus | int |  | 执行状态 (AllocateStatusEnum) | 0 | 0=未执行; |