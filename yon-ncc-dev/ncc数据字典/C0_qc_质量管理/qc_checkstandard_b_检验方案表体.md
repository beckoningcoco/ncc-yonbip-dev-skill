# |<<

**检验方案表体 (qc_checkstandard_b / nc.vo.qc.checkstandard.entity.CheckStandardItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4835.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkstandard_b | 检验方案表体主键 | pk_checkstandard_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 5 | pk_checkitem | 检验项目 | pk_checkitem | varchar(20) |  | 检验项目 (qc_checkitem) |
| 6 | bkeyitem | 关键项目 | bkeyitem | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | bdefaultitem | 默认项目 | bdefaultitem | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_measdoc | 检验值单位 | pk_measdoc | varchar(20) |  | 字符串 (String) |
| 9 | vstandardvalue | 标准值 | vstandardvalue | varchar(1024) |  | 字符串 (String) |
| 10 | vstandardprint | 标准值打印样式 | vstandardprint | varchar(512) |  | 字符串 (String) |
| 11 | bmustreach | 必须达到 | bmustreach | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_checkmode | 取样方式 | pk_checkmode | varchar(20) |  | 取样方式 (qc_checkmode) |
| 13 | pk_checkbasis | 检测依据 | pk_checkbasis | varchar(20) |  | 检测依据 (qc_checkbasis) |
| 14 | pk_checkmethod | 检测方法 | pk_checkmethod | varchar(20) |  | 检测依据子表 (qc_checkbasis_b) |
| 15 | pk_workcenter | 检测中心 | pk_workcenter | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 16 | pk_outsupplier | 外部检测机构 | pk_outsupplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 17 | vmemo_b | 备注 | vmemo_b | varchar(181) |  | 字符串 (String) |
| 18 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |