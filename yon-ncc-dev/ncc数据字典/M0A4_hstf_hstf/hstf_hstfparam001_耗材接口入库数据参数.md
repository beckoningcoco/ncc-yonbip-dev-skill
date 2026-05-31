# |<<

**耗材接口入库数据参数 (hstf_hstfparam001 / nc.vo.hstf.hstf_para001.HstfParam001VO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2762.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hstfparam001 | ID | pk_hstfparam001 | char(20) | √ | 主键 (UFID) |
| 2 | bill_40 | 期初余额 | bill_40 | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | bill_45 | 采购入库 | bill_45 | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | bill_4a | 其他入库 | bill_4a | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | bill_4e | 调拨入库 | bill_4e | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | bill_4401 | 设备入库 | bill_4401 | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 8 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |