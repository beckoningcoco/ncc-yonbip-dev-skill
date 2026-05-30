# |<<

**群体公卫领域流程管理 (bd_uh_poh_wf / com.yonyou.yh.nhis.bd.phdomainowf.vo.PhDomainOWfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1088.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pohwf | 群体公卫服务流程主键 | pk_pohwf | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_ph | 公卫领域 | pk_ph | varchar(20) |  | 公卫领域定义 (phdomain) |
| 5 | sortno | 公卫领域内序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_pohwftype | 流程类型 | pk_pohwftype | varchar(20) |  | 公卫群体流程类型(自定义档案) (Defdoc-070010) |
| 7 | dt_pohwftype | 流程类型编码 | dt_pohwftype | varchar(50) |  | 字符串 (String) |
| 8 | code | 流程编码 | code | varchar(30) |  | 字符串 (String) |
| 9 | name | 流程名称 | name | varchar(50) |  | 多语文本 (MultiLangText) |
| 10 | pk_phds | 对应公卫数据集 | pk_phds | varchar(20) |  | 公卫服务数据集 (phds) |
| 11 | pk_pohwffreq | 群体公卫服务周期频率 | pk_pohwffreq | varchar(20) |  | 公卫群体领域服务周期频率(自定义档案) (Defdoc-070011) |
| 12 | dt_pohwffreq | 群体公卫服务周期频率编码 | dt_pohwffreq | varchar(50) |  | 字符串 (String) |
| 13 | freq_cn | 频率下次数 | freq_cn | int |  | 整数 (Integer) |
| 14 | weekdayno | 星期或日期数串 | weekdayno | varchar(50) |  | 字符串 (String) |
| 15 | interval | 流程间隔(天) | interval | varchar(256) |  | 字符串 (String) |
| 16 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | note | 备注 | note | varchar(256) |  | 备注 (Memo) |
| 18 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 19 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 20 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 22 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |