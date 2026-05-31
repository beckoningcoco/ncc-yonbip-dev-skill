# |<<

**主体间价值转移方式 (ia_valuetrans / nc.vo.ia.valuetrans.entity.ValueTransVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2864.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cvaluetransid | 主键 | cvaluetransid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | csrcorgid | 来源组织 | csrcorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | csrcorgvid | 来源组织版本 | csrcorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | cdestorgid | 目的组织 | cdestorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | cdestorgvid | 目的组织版本 | cdestorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | ftransmodeflag | 结转方式 | ftransmodeflag | varchar(50) |  | 结转方式 (carrymode) |  | 1=平行结转; |