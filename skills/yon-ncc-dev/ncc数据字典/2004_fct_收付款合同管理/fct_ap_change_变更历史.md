# |<<

**变更历史 (fct_ap_change / nc.vo.fct.ap.entity.CtApChangeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2167.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fct_ap_change | 变更历史主键 | pk_fct_ap_change | char(20) | √ | 主键 (UFID) |
| 2 | vchangecode | 版本号 | vchangecode | decimal(28, 8) |  | 数值 (UFDouble) |
| 3 | vchgpsn | 变更人 | vchgpsn | varchar(20) |  | 用户 (user) |
| 4 | vchgdate | 变更时间 | vchgdate | char(19) |  | 日期 (UFDate) |
| 5 | vchgreason | 变更原因 | vchgreason | varchar(256) |  | 字符串 (String) |
| 6 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
| 7 | vchgcontent | 变更内容 | vchgcontent | varchar(256) |  | 字符串 (String) |
| 8 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |