# |<<

**基金管理人 (ipmfund_manager_info / nc.vo.ipmfund.fundmanagerinfo.FundManagerInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3331.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_manager_info | 基金管理人主键 | pk_manager_info | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | manage_name | 名称 | manage_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | name | 基金管理人名称 | name | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 5 | inner_enterprise | 是否内部企业 | inner_enterprise | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | financial_institution | 是否非保险类金融机构 | financial_institution | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | subsidiary_corporation | 是否非保险类金融机构子公司 | subsidiary_corporation | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | venture_fund | 是否管理创业投资基金 | venture_fund | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | third_party | 是否为符合提供投资建议条件的第三方机构 | third_party | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | registration | 是否完成登记 | registration | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | register_time | 登记时间 | register_time | char(19) |  | 日期 (UFDate) |
| 12 | register_number | 登记编号 | register_number | varchar(50) |  | 字符串 (String) |
| 13 | institutional_type | 机构类型 | institutional_type | varchar(50) |  | 机构类型 (InstitutionalTypeEnum) |  | 1=私募股权、创业投资基金管理人; |