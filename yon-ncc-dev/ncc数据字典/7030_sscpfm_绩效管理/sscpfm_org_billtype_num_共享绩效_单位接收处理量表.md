# |<<

**共享绩效_单位接收处理量表 (sscpfm_org_billtype_num / nc.vo.sscpfm.basic.PFMOrgBilltypeNumVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5580.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_org_billtype_num | 主键 | pk_org_billtype_num | varchar(50) | √ | 字符串 (String) |
| 2 | sscunit | 共享中心主键 | sscunit | varchar(1024) |  | 字符串 (String) |
| 3 | pk_org | 单据组织主键 | pk_org | varchar(1024) |  | 字符串 (String) |
| 4 | pk_billtype | 单据类型主键 | pk_billtype | varchar(1024) |  | 字符串 (String) |
| 5 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(1024) |  | 字符串 (String) |
| 6 | num_date | 日期 | num_date | char(19) |  | 日期 (UFDate) |
| 7 | num_receive | 接收量 | num_receive | int |  | 整数 (Integer) |
| 8 | num_deal | 处理量 | num_deal | int |  | 整数 (Integer) |