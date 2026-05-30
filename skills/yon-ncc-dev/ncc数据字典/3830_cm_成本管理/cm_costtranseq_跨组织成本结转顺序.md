# |<<

**跨组织成本结转顺序 (cm_costtranseq / nc.vo.cm.costtranseq.CostTranSeqVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1459.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccosttranseqid | 跨组织成本结转顺序表 | ccosttranseqid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_factory | 工厂最新版本 | pk_factory | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | nseq | 顺序号 | nseq | int |  | 整数 (Integer) |
| 5 | pk_org | 组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | pk_org_v | 组织 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 7 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计期间档案 (accperiod) |
| 8 | pk_factory_v | 工厂 | pk_factory_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |