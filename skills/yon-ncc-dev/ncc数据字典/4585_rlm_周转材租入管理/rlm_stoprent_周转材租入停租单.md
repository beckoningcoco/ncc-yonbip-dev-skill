# |<<

**周转材租入停租单 (rlm_stoprent / nc.vo.rlm.stoprent.StopRentHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4958.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stoprent | 停租单主键 | pk_stoprent | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 承租组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 承租组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | pk_org_out | 出租组织最新版本 | pk_org_out | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | pk_org_out_v | 出租组织 | pk_org_out_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | bill_code | 停租单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 8 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |