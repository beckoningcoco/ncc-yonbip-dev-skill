# |<<

**打印方案 (qc_printscheme / nc.vo.qc.printscheme.entity.PrintSchemeHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4850.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printscheme | 打印方案 | pk_printscheme | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心（OID） | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 5 | vschemecode | 方案编码 | vschemecode | varchar(40) |  | 字符串 (String) |
| 6 | vschemename | 方案名称 | vschemename | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | bprintmaterial | 打印主料 | bprintmaterial | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_mprintscheme | 主料打印方案 | pk_mprintscheme | varchar(20) |  | 打印方案 (qc_printscheme) |
| 9 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |