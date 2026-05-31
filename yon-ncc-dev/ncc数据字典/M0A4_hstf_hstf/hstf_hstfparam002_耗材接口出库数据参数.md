# |<<

**耗材接口出库数据参数 (hstf_hstfparam002 / nc.vo.hstf.hstf_para002.HstfParam002VO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2763.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hstfpara002 | ID | pk_hstfpara002 | char(20) | √ | 主键 (UFID) |
| 2 | bill_4d | 材料出库 | bill_4d | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | bill_4i | 其他出库 | bill_4i | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | bill_4451 | 设备出库 | bill_4451 | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | bill_4y | 调拨出库 | bill_4y | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | bill_4c | 销售出库 | bill_4c | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 8 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |