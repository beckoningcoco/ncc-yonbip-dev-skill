# |<<

**保险 (fa_insuranceview / nc.vo.fa.asset.InsuranceViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2029.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_insurance | 主键 | pk_insurance | char(20) | √ | 主键 (UFID) |
| 2 | bill_code | 保险单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 3 | type | 保险类别 | type | varchar(80) |  | 字符串 (String) |
| 4 | corp | 保险公司 | corp | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 5 | value | 保险金额 | value | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | begin_date | 保险开始日期 | begin_date | char(19) |  | 日期 (UFDate) |
| 7 | end_date | 保险结束日期 | end_date | char(19) |  | 日期 (UFDate) |
| 8 | remark | 保险备注 | remark | varchar(200) |  | 字符串 (String) |
| 9 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |