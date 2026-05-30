# |<<

**投资项目阶段 (ipm_bd_investstage / nc.vo.ipmbd.investstage.InvestStageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3173.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_investstage | 投资项目阶段主键 | pk_investstage | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | stage_code | 阶段编码 | stage_code | varchar(40) | √ | 字符串 (String) |
| 6 | stage_name | 阶段名称 | stage_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | stage_category | 阶段类别 | stage_category | varchar(20) |  | 阶段类别 (StageCategoryEnum) |  | 1=备案; |