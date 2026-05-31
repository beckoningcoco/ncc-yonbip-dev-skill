# |<<

**医保分解数据项定义 (bd_uh_hp_segm / com.yonyou.yh.nhis.bd.hppaysegment.vo.HPPaySegmentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1036.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpsegm | 医保计划付款段主键 | pk_hpsegm | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_hp | 医保计划 | pk_hp | varchar(50) |  | 字符串 (String) |
| 5 | code | 付款段编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 付款段名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | segmdesc | 付款段描述 | segmdesc | varchar(200) |  | 备注 (Memo) |
| 8 | flag_show | 显示标志 | flag_show | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |