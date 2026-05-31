# |<<

**预防用药列表 (uh_oc_expose_report_md / com.yonyou.yh.nhis.cn.hims.vo.OcExposeReportAsMdlistVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6138.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oc_expose_report_md | 药品表主键 | pk_oc_expose_report_md | char(20) | √ | 主键 (UFID) |
| 2 | medicine_name | 药品名称 | medicine_name | varchar(50) |  | 字符串 (String) |
| 3 | pk_medicine | 药品主键 | pk_medicine | varchar(50) |  | 字符串 (String) |
| 4 | num | 剂量 | num | varchar(50) |  | 字符串 (String) |
| 5 | unit | 单位 | unit | varchar(50) |  | 字符串 (String) |
| 6 | start_time | 开始用药时间 | start_time | varchar(50) |  | 字符串 (String) |
| 7 | end_time | 停止用药时间 | end_time | varchar(50) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |