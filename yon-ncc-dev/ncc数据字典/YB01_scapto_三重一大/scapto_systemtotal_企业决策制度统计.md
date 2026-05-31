# |<<

**企业决策制度统计 (scapto_systemtotal / nc.vo.scapto.systemtotal.SystemTotalVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5191.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_systemtotal | 企业决策制度统计 | pk_systemtotal | char(20) | √ | 主键 (UFID) |
| 2 | company_name | 企业名称 | company_name | varchar(50) |  | 字符串 (String) |
| 3 | company_code | 企业编码 | company_code | varchar(50) |  | 字符串 (String) |
| 4 | system_total | 企业制度总数 | system_total | int |  | 整数 (Integer) |
| 5 | system_constitution | 公司章程制度数量 | system_constitution | int |  | 整数 (Integer) |
| 6 | system_implementation | 实施办法制度数量 | system_implementation | int |  | 整数 (Integer) |
| 7 | system_manage | 管理办法制度数量 | system_manage | int |  | 整数 (Integer) |
| 8 | meet_party | 党委（党组）会议事规则数量 | meet_party | int |  | 整数 (Integer) |
| 9 | meet_director | 董事会议事规则数量 | meet_director | int |  | 整数 (Integer) |
| 10 | meet_manage | 经理层办公会议事规则数量 | meet_manage | int |  | 整数 (Integer) |
| 11 | isconstitutionabnomal | 是否公司章程制度异常 | isconstitutionabnomal | varchar(50) |  | 字符串 (String) |
| 12 | isimplementationabnomal | 是否实施办法制度异常 | isimplementationabnomal | varchar(50) |  | 字符串 (String) |
| 13 | ispartyruleabnomal | 是否党委（党组）会议事规则异常 | ispartyruleabnomal | varchar(50) |  | 字符串 (String) |
| 14 | isdirectorabnomal | 是否董事会议事规则异常 | isdirectorabnomal | varchar(50) |  | 字符串 (String) |
| 15 | ismanageabnomal | 是否经理层办公会议事规则异常 | ismanageabnomal | varchar(50) |  | 字符串 (String) |