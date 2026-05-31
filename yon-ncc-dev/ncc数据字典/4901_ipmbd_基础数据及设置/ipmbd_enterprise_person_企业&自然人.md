# |<<

**企业&自然人 (ipmbd_enterprise_person / nc.vo.ipmbd.enterpriseperson.EnterprisePersonVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3225.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_enterprise_person | 企业and自然人主键 | pk_enterprise_person | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 法人组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 法人组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 7 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | category | 类别 | category | varchar(50) |  | 企业and自然人类别 (EnterprisePersonType) |  | 1=企业; |