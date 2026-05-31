# |<<

**企业事项数量统计 (scapto_mattertotal / nc.vo.scapto.mattertotal.MatterTotalVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5156.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mattertotal | 企业事项数量统计 | pk_mattertotal | char(20) | √ | 主键 (UFID) |
| 2 | company_code | 企业编码 | company_code | varchar(50) |  | 字符串 (String) |
| 3 | company_name | 企业名称 | company_name | varchar(50) |  | 字符串 (String) |
| 4 | matter_total | 事项总数 | matter_total | int |  | 整数 (Integer) |
| 5 | matter_decide | 重大决策事项数量 | matter_decide | int |  | 整数 (Integer) |
| 6 | matter_appoint | 重要人事任免事项数量 | matter_appoint | int |  | 整数 (Integer) |
| 7 | matter_project | 重大项目安排事项数量 | matter_project | int |  | 整数 (Integer) |
| 8 | matter_fund | 大额资金运作事项数量 | matter_fund | int |  | 整数 (Integer) |