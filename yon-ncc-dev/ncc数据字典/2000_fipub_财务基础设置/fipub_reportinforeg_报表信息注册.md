# |<<

**报表信息注册 (fipub_reportinforeg / nc.vo.fipub.report.ReportInfoRegVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2270.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportinforeg | 主键 | pk_reportinforeg | char(20) | √ | 主键 (UFID) |
| 2 | ownmodule | 所属模块 | ownmodule | varchar(50) | √ | 字符串 (String) |
| 3 | reporttype | 报表类型 | reporttype | varchar(50) | √ | 字符串 (String) |
| 4 | pk_rep | 预置报表主键 | pk_rep | char(20) | √ | 主键 (UFID) |
| 5 | pk_repdetail | 预置明细报表主键 | pk_repdetail | char(20) |  | 主键 (UFID) |
| 6 | querytemplatecode | 预置查询模板编码 | querytemplatecode | varchar(50) |  | 字符串 (String) |
| 7 | brief | 摘要 | brief | varchar(50) |  | 字符串 (String) |
| 8 | isfixedcurr | 是否固定显示币种 | isfixedcurr | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | isweb | 是否轻量化 | isweb | char(1) |  | 布尔类型 (UFBoolean) |