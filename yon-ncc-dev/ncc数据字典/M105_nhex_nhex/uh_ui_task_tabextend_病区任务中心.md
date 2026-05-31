# |<<

**病区任务中心 (uh_ui_task_tabextend / com.yonyou.yh.nhis.ex.ns.vo.PatientReginURLVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6293.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | 主键 | pk_id | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | url | 病区任务url | url | varchar(50) |  | 字符串 (String) |
| 5 | typelevel | 任务类型 | typelevel | char(50) |  | 字符串 (String) |
| 6 | urlcn | 病区任务url中文 | urlcn | varchar(50) |  | 字符串 (String) |
| 7 | urlcntitle | 病区任务中文title | urlcntitle | varchar(50) |  | 字符串 (String) |
| 8 | ywbm | 业务编码 | ywbm | varchar(50) |  | 字符串 (String) |
| 9 | ywmc | 业务名称 | ywmc | varchar(50) |  | 字符串 (String) |