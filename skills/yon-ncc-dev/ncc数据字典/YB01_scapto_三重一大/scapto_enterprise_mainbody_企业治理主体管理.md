# |<<

**企业治理主体管理 (scapto_enterprise_mainbody / nc.vo.scapto.enterprisemainbody.EnterpriseMainbodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5125.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_enterprise_mainbody | 企业治理主体管理主键 | pk_enterprise_mainbody | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_行政组织版本信息 (adminorg_v) |
| 5 | name | 企业名称 | name | varchar(512) |  | 多语文本 (MultiLangText) |
| 6 | code | 企业编码 | code | varchar(64) | √ | 字符串 (String) |
| 7 | bistoitem | 是否有三重一大决策事项 | bistoitem | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | bistopower | 是否有三重一大决策权 | bistopower | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pk_operateactivity | 经营活动情况 | pk_operateactivity | varchar(20) |  | 经营活动情况设置 (OperateActivityVO) |
| 10 | vdomestic | 境内境外标志 | vdomestic | varchar(50) |  | 境内境外标志 (DomesticEnum) |  | 1=境内; |