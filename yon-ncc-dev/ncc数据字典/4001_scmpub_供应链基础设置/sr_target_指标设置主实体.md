# |<<

**指标设置主实体 (sr_target / nc.vo.scmf.sr.target.entity.TargetHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5483.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_target | 指标设置主实体 | pk_target | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | vcode | 销售指标表编号 | vcode | varchar(50) |  | 字符串 (String) |
| 5 | vname | 销售指标表名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | blowsetflag | 统一设定下级销售组织指标值 | blowsetflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | fyearflag | 年度 | fyearflag | int |  | 年度 (YearType) |  | 2010=2010; |