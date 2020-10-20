/** CREATE DATABASE  IF NOT EXISTS `cmp`  DEFAULT CHARACTER SET utf8mb4 ;*/
use cmp;
DROP TABLE IF EXISTS `agency_info`;
CREATE TABLE `agency_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `logo` varchar(512) DEFAULT NULL COMMENT 'logo地址',
  `company_name` varchar(50) DEFAULT NULL COMMENT '机构名称，唯一',
  `company_addr` varchar(512) DEFAULT NULL COMMENT '公司地址',
  `agency_type` int(2) DEFAULT NULL COMMENT '机构类型,1培训，2咨询，3工程',
  `industry` varchar(100) DEFAULT NULL COMMENT '所属行业',
  `phone` varchar(100) DEFAULT NULL COMMENT '联系人手机号',
  `user_id` int(11) DEFAULT NULL COMMENT '机构联系人-用户id，FK',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='机构信息';

--
-- Table structure for table `agency_relation`
--

DROP TABLE IF EXISTS `agency_relation`;
CREATE TABLE `agency_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `agency_id` int(11) DEFAULT NULL COMMENT '机构id',
  `entity_name` varchar(100) DEFAULT NULL COMMENT '实体名称',
  `relation_type` varchar(10) DEFAULT NULL COMMENT '关系类型，A:证件，B:资质，C:学科',
  `relater_id` int(11) DEFAULT NULL COMMENT '关系id-证件、资质、学科id',
  `location` varchar(1024) DEFAULT NULL COMMENT '地址',
  `certificate_type` varchar(100) DEFAULT NULL COMMENT '证件类别',
  `industry` varchar(100) DEFAULT NULL COMMENT '所属行业',
  `belong_type` varchar(100) DEFAULT NULL COMMENT '所属分类',
  `major` varchar(100) DEFAULT NULL COMMENT '所属专业',
  `certification_authority` varchar(100) DEFAULT NULL COMMENT '发证机关',
  `examination_time` varchar(255) DEFAULT NULL COMMENT '考试时间/学',
  `examination_intro` varchar(1024) DEFAULT NULL COMMENT '报（开）考说明',
  `comment` varchar(1024) DEFAULT NULL COMMENT '备注',
  `deal_flag` int(2) DEFAULT '0' COMMENT '处理标识,默认为未处理',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='证件、资质、学科分别与机构关系';

--
-- Table structure for table `answer_bank_relation`
--

DROP TABLE IF EXISTS `answer_bank_relation`;
CREATE TABLE `answer_bank_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `bank_id` int(11) DEFAULT NULL COMMENT '题库ID',
  `record_id` int(11) DEFAULT NULL COMMENT '答题记录ID',
  `user_answer` varchar(100) DEFAULT NULL COMMENT '用户答案',
  `result_flag` int(2) DEFAULT NULL COMMENT '结果标识，1:正确；2：错误',
  `change_num` int(8) DEFAULT NULL COMMENT '改动次数',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='答题记录与题库关系表';

--
-- Table structure for table `answer_record`
--

DROP TABLE IF EXISTS `answer_record`;
CREATE TABLE `answer_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `user_name` varchar(100) DEFAULT NULL COMMENT '用户名称',
  `paper_id` int(11) DEFAULT NULL COMMENT '试卷ID',
  `paper_name` varchar(100) DEFAULT NULL COMMENT '试卷名称',
  `answer_time` varchar(100) DEFAULT NULL COMMENT '答题日期',
  `get_points` decimal(4,1) DEFAULT '0.0' COMMENT '得分',
  `right_num` int(4) DEFAULT NULL COMMENT '正确数',
  `wrong_num` int(4) DEFAULT NULL COMMENT '错误数',
  `cumulative_time` decimal(12,1) DEFAULT '0.0' COMMENT '累计耗时',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='答题记录表';

--
-- Table structure for table `aptitude_declare_condition`
--

DROP TABLE IF EXISTS `aptitude_declare_condition`;
CREATE TABLE `aptitude_declare_condition` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `aptitude_id` int(11) DEFAULT NULL COMMENT '资质ID',
  `condition_num` varchar(100) DEFAULT NULL COMMENT '条件序号',
  `condition_intro` varchar(100) DEFAULT NULL COMMENT '条件说明',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='资质申报条件';

--
-- Table structure for table `aptitude_info`
--

DROP TABLE IF EXISTS `aptitude_info`;
CREATE TABLE `aptitude_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `aptitude_name` varchar(100) DEFAULT NULL COMMENT '资质名称',
  `industry` varchar(100) DEFAULT NULL COMMENT '所属行业',
  `policy_intro` varchar(1024) DEFAULT NULL COMMENT '政策说明',
  `area_coverage` varchar(100) DEFAULT NULL COMMENT '区域范围',
  `competent_unit` varchar(100) DEFAULT NULL COMMENT '主管单位',
  `other_info` varchar(100) DEFAULT NULL COMMENT '其他信息',
  `no_question` int(2) DEFAULT '1' COMMENT '没有题库,默认为1',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `total_question` int(11) DEFAULT '0' COMMENT '总题数',
  `lower_limit` int(11) DEFAULT '0' COMMENT '最低限制',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='资质信息';

--
-- Table structure for table `certificate_exam_condition`
--

DROP TABLE IF EXISTS `certificate_exam_condition`;
CREATE TABLE `certificate_exam_condition` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `certificate_id` int(11) DEFAULT NULL COMMENT '证件ID',
  `condition_num` varchar(100) DEFAULT NULL COMMENT '条件序号',
  `condition_intro` varchar(100) DEFAULT NULL COMMENT '条件说明',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='证件报考条件';

--
-- Table structure for table `certificate_info`
--

DROP TABLE IF EXISTS `certificate_info`;
CREATE TABLE `certificate_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `certificate_name` varchar(100) DEFAULT NULL COMMENT '证件名称',
  `certificate_type` varchar(100) DEFAULT NULL COMMENT '证件类别',
  `industry` varchar(100) DEFAULT NULL COMMENT '所属行业',
  `belong_type` varchar(100) DEFAULT NULL COMMENT '所属分类',
  `major` varchar(100) DEFAULT NULL COMMENT '所属专业',
  `certification_authority` varchar(100) DEFAULT NULL COMMENT '发证机关',
  `examination_time` varchar(255) DEFAULT NULL COMMENT '考试时间/学',
  `examination_intro` varchar(1024) DEFAULT NULL COMMENT '报（开）考说明',
  `comment` varchar(1024) DEFAULT NULL COMMENT '备注',
  `banned_major` varchar(512) DEFAULT NULL COMMENT '限制专业',
  `policy_intro` varchar(1024) DEFAULT NULL COMMENT '政策说明',
  `area` varchar(100) DEFAULT NULL COMMENT '所属地区',
  `testing_centre` varchar(100) DEFAULT NULL COMMENT '常设考点',
  `test_frequency` varchar(100) DEFAULT NULL COMMENT '考试频次',
  `work_type` varchar(100) DEFAULT NULL COMMENT '作业类别',
  `other_info` varchar(100) DEFAULT NULL COMMENT '其他信息',
  `image_url` varchar(1024) DEFAULT NULL COMMENT '图片路径',
  `no_question` int(2) DEFAULT '1' COMMENT '没有题库,默认为1',
  `deal_flag` int(2) DEFAULT '0' COMMENT '处理标识,默认为未处理',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `total_question` int(11) DEFAULT '0' COMMENT '总题数',
  `lower_limit` int(11) DEFAULT '0' COMMENT '最低限制',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='证件信息';

--
-- Table structure for table `declare_application`
--

DROP TABLE IF EXISTS `declare_application`;
CREATE TABLE `declare_application` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `aptitude_id` int(11) DEFAULT NULL COMMENT '资质ID',
  `company_id` int(11) DEFAULT NULL COMMENT '公司ID',
  `application_time` varchar(50) DEFAULT NULL COMMENT '申请日期',
  `agency_id` int(11) DEFAULT NULL COMMENT '跟进机构ID',
  `merchandiser_id` int(11) DEFAULT NULL COMMENT '跟进业务员ID',
  `current_progress` int(2) DEFAULT NULL COMMENT '当前进度，默认为0：申请中，1：处理中，2：结束',
  `attachment_ids` varchar(1024) DEFAULT NULL COMMENT '附件ID集',
  `progress_intro` varchar(50) DEFAULT NULL COMMENT '进度说明',
  `get_way` varchar(100) DEFAULT NULL COMMENT '获取途径',
  `declare_num` int(2) DEFAULT NULL COMMENT '申报数量',
  `service_fee` decimal(10,2) DEFAULT '0.00' COMMENT '服务费用',
  `expect_time` varchar(50) DEFAULT NULL COMMENT '期望时间',
  `predict_time` varchar(50) DEFAULT NULL COMMENT '预计时间',
  `actual_time` varchar(50) DEFAULT NULL COMMENT '实际时间',
  `company_evaluate` varchar(512) DEFAULT NULL COMMENT '公司评价',
  `agency_evaluate` varchar(512) DEFAULT NULL COMMENT '机构评价',
  `platform_evaluate` varchar(512) DEFAULT NULL COMMENT '平台评价',
  `company_comment` varchar(512) DEFAULT NULL COMMENT '公司备注',
  `agency_comment` varchar(512) DEFAULT NULL COMMENT '机构备注',
  `platform_comment` varchar(512) DEFAULT NULL COMMENT '平台备注',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='申报申请表';

--
-- Table structure for table `dictionary_data`
--

DROP TABLE IF EXISTS `dictionary_data`;
CREATE TABLE `dictionary_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `data_code` varchar(100) DEFAULT NULL COMMENT '数据代号',
  `data_name` varchar(100) DEFAULT NULL COMMENT '数据名',
  `data_type` varchar(100) DEFAULT NULL COMMENT '数据类型',
  `parent_id` int(11) DEFAULT NULL COMMENT '上级id',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='字典数据表';

--
-- Table structure for table `dictionary_type`
--

DROP TABLE IF EXISTS `dictionary_type`;
CREATE TABLE `dictionary_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `type_code` varchar(100) DEFAULT NULL COMMENT '类型代号',
  `type_name` varchar(100) DEFAULT NULL COMMENT '类型名称',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='字典类型表';

--
-- Table structure for table `employee_info`
--

DROP TABLE IF EXISTS `employee_info`;
CREATE TABLE `employee_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `employee_no` varchar(255) DEFAULT NULL COMMENT '工号',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `employee_name` varchar(255) DEFAULT NULL COMMENT '员工姓名',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id，FK',
  `agency_id` int(11) DEFAULT NULL COMMENT '机构id,',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='员工信息';

--
-- Table structure for table `examination_paper`
--

DROP TABLE IF EXISTS `examination_paper`;
CREATE TABLE `examination_paper` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `bank_id` int(11) DEFAULT NULL COMMENT '题库ID',
  `agency_id` int(11) DEFAULT NULL COMMENT '机构ID',
  `paper_name` varchar(50) DEFAULT NULL COMMENT '试卷名称',
  `paper_intro` varchar(100) DEFAULT NULL COMMENT '试卷说明',
  `paper_type` int(2) DEFAULT NULL COMMENT '试卷类型，1随机，2固定，3冲关',
  `time_limit` varchar(100) DEFAULT NULL COMMENT '限时',
  `entity_type` int(2) DEFAULT NULL COMMENT '实体类型，1证件，2资质，3学科',
  `entity_id` int(11) DEFAULT NULL COMMENT '实体ID',
  `entity_name` varchar(100) DEFAULT NULL COMMENT '实体名称',
  `points` varchar(512) DEFAULT NULL COMMENT '知识点ID：多个用,隔开',
  `knowledge_type` int(2) DEFAULT NULL COMMENT '知识点类型，1证件，2资质，3学科',
  `creater_id` int(11) DEFAULT NULL COMMENT '创建人ID',
  `user_id` int(11) DEFAULT NULL COMMENT '所属用户ID',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='试卷信息表';

--
-- Table structure for table `follow_record`
--

DROP TABLE IF EXISTS `follow_record`;
CREATE TABLE `follow_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `trainee_id` int(11) DEFAULT NULL COMMENT '跟进对象-客户ID',
  `agency_id` int(11) DEFAULT NULL COMMENT '服务机构ID',
  `employee_id` int(11) DEFAULT NULL COMMENT '跟进业务员ID',
  `follow_time` varchar(100) DEFAULT NULL COMMENT '跟进时间',
  `record_content` varchar(1024) DEFAULT NULL COMMENT '跟进记录',
  `comment` varchar(1024) DEFAULT NULL COMMENT '备注',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='跟进信息';

--
-- Table structure for table `knowledge_point`
--

DROP TABLE IF EXISTS `knowledge_point`;
CREATE TABLE `knowledge_point` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `main_id` int(11) DEFAULT NULL COMMENT '主体ID',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `intro` varchar(100) DEFAULT NULL COMMENT '说明',
  `knowledge_type` int(2) DEFAULT NULL COMMENT '知识点类型，1证件，2资质，3学科',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='知识点表';

--
-- Table structure for table `paper_bank_relation`
--

DROP TABLE IF EXISTS `paper_bank_relation`;
CREATE TABLE `paper_bank_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `bank_id` int(11) DEFAULT NULL COMMENT '题库ID',
  `paper_id` int(11) DEFAULT NULL COMMENT '试卷ID',
  `user_id` int(11) DEFAULT NULL COMMENT '所属用户ID',
  `sequence_num` int(8) DEFAULT NULL COMMENT '排序',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='试卷题库关系表';

--
-- Table structure for table `question_bank`
--

DROP TABLE IF EXISTS `question_bank`;
CREATE TABLE `question_bank` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `agency_id` int(11) DEFAULT NULL COMMENT '机构ID',
  `points` varchar(512) DEFAULT NULL COMMENT '知识点ID：多个用,隔开',
  `entity_id` int(11) DEFAULT NULL COMMENT '实体名称id-用于存放证件、资质和学科名称的id',
  `entity_type` int(2) DEFAULT NULL COMMENT '实体类型，1证件，2资质，3学科',
  `temp_workname` varchar(500) DEFAULT NULL COMMENT '临时，存放外部导入的不规范的证件名/作业名',
  `question_stem` varchar(100) DEFAULT NULL COMMENT '题干',
  `resolution` varchar(100) DEFAULT NULL COMMENT '解析',
  `point_value` decimal(4,1) DEFAULT '0.0' COMMENT '分值',
  `right_answer` varchar(100) DEFAULT NULL COMMENT '正确答案，多个用，隔开',
  `question_type` int(2) DEFAULT '1' COMMENT '题目类型：1单选，2多选，3判断，默认为1',
  `image_addr` varchar(100) DEFAULT NULL COMMENT '图片地址',
  `image_type` int(2) DEFAULT '1' COMMENT '图片类型：1小，2中，3大，默认为1',
  `time_limit` varchar(100) DEFAULT NULL COMMENT '限时',
  `creater_id` int(11) DEFAULT NULL COMMENT '创建人ID',
  `knowledge_type` int(2) DEFAULT NULL COMMENT '知识点类型，1证件，2资质，3学科',
  `knowledge_intro` varchar(100) DEFAULT NULL COMMENT '知识点说明',
  `change_num` int(2) DEFAULT NULL COMMENT '改动次数',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段（作业名称，导入excel时使用）',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='题库信息表';

--
-- Table structure for table `question_option`
--

DROP TABLE IF EXISTS `question_option`;
CREATE TABLE `question_option` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `bank_id` int(11) DEFAULT NULL COMMENT '题库ID',
  `option_code` varchar(50) DEFAULT NULL COMMENT '选项代码',
  `option_content` varchar(512) DEFAULT NULL COMMENT '选项内容',
  `image_addr` varchar(512) DEFAULT NULL COMMENT '图片地址',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='题库选项表';

--
-- Table structure for table `subject_info`
--

DROP TABLE IF EXISTS `subject_info`;
CREATE TABLE `subject_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `subject_name` varchar(100) DEFAULT NULL COMMENT '学科名称',
  `industry` varchar(100) DEFAULT NULL COMMENT '所属行业',
  `degree` varchar(100) DEFAULT NULL COMMENT '所属学历',
  `major` varchar(100) DEFAULT NULL COMMENT '所属专业',
  `school` varchar(100) DEFAULT NULL COMMENT '所属院校',
  `other_info` varchar(100) DEFAULT NULL COMMENT '其他信息',
  `no_question` int(2) DEFAULT '1' COMMENT '没有题库,默认为1',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `total_question` int(11) DEFAULT '0' COMMENT '总题数',
  `lower_limit` int(11) DEFAULT '0' COMMENT '最低限制',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='学科信息';

--
-- Table structure for table `test_application`
--

DROP TABLE IF EXISTS `test_application`;
CREATE TABLE `test_application` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `certificate_id` int(11) DEFAULT NULL COMMENT '证件ID',
  `test_application_type` int(2) DEFAULT NULL COMMENT '报考类型，',
  `trainee_id` int(11) DEFAULT NULL COMMENT '学员ID',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `application_time` varchar(50) DEFAULT NULL COMMENT '申请日期',
  `get_certificate_way` varchar(100) DEFAULT NULL COMMENT '获证途径',
  `agency_id` int(11) DEFAULT NULL COMMENT '跟进机构ID',
  `employee_id` int(11) DEFAULT NULL COMMENT '跟进业务员ID',
  `current_progress` int(2) DEFAULT NULL COMMENT '当前进度，默认为0：申请中，1：处理中，2：结束',
  `reference_time` varchar(50) DEFAULT NULL COMMENT '参考日期',
  `progress_intro` varchar(50) DEFAULT NULL COMMENT '进度说明',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  `attachments` varchar(2048) DEFAULT NULL COMMENT '附件集',
  `service_fee` decimal(10,2) DEFAULT '0.00' COMMENT '服务费用',
  `trainee_evaluate` varchar(512) DEFAULT NULL COMMENT '学员评价',
  `agency_evaluate` varchar(512) DEFAULT NULL COMMENT '机构评价',
  `platform_evaluate` varchar(512) DEFAULT NULL COMMENT '平台评价',
  `trainee_comment` varchar(512) DEFAULT NULL COMMENT '学员备注',
  `agency_comment` varchar(512) DEFAULT NULL COMMENT '机构备注',
  `platform_comment` varchar(512) DEFAULT NULL COMMENT '平台备注',
  `be_allocate` int(2) DEFAULT '0' COMMENT '是否已分配跟进员工，默认为0：否，1：是',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='报考申请表';

--
-- Table structure for table `trainee_info`
--

DROP TABLE IF EXISTS `trainee_info`;
CREATE TABLE `trainee_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id，FK',
  `trainee_name` varchar(100) DEFAULT NULL COMMENT '学员姓名',
  `trainee_type` int(2) DEFAULT NULL COMMENT '【学员类别】：0潜在学员,1正式学员,2',
  `phone` varchar(100) DEFAULT NULL COMMENT '联系人手机号',
  `agency_id` int(11) DEFAULT NULL COMMENT '机构id,',
  `employee_id` int(11) DEFAULT NULL COMMENT '业务员id，FK',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='机构学员信息';

--
-- Table structure for table `user_info`
--

DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(100) DEFAULT NULL COMMENT '姓名',
  `nick_name` varchar(100) DEFAULT NULL COMMENT '昵称',
  `gender` int(2) DEFAULT NULL COMMENT '性别 （1是男性，2是女性，0是未知）',
  `age` int(4) DEFAULT NULL COMMENT '年龄',
  `phone` varchar(100) DEFAULT NULL COMMENT '用户手机号',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `user_type` varchar(10) DEFAULT NULL COMMENT '用户类型，A:超管 ，B:平台，C:机管,D:机员，E:学员',
  `token` varchar(100) DEFAULT NULL COMMENT 'token',
  `transfer_time` timestamp NULL DEFAULT NULL COMMENT '转会时间',
  `last_login_time` timestamp NULL DEFAULT NULL COMMENT '上次登录时间',
  `invite_code` varchar(100) DEFAULT NULL COMMENT '邀请码',
  `inviter_id` int(11) DEFAULT NULL COMMENT '邀请人用户id',
  `openid` varchar(100) DEFAULT NULL COMMENT '微信openId/机构ID',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `status` int(2) DEFAULT NULL COMMENT '状态',
  `registration_time` timestamp NULL DEFAULT NULL COMMENT '注册时间',
  `points` int(4) DEFAULT NULL COMMENT '积分',
  `balance` decimal(12,2) DEFAULT '0.00' COMMENT '余额，0.00',
  `activation_code` varchar(50) DEFAULT NULL COMMENT '激活码',
  `activation_time` timestamp NULL DEFAULT NULL COMMENT '激活时间',
  `level` int(4) DEFAULT NULL COMMENT '用户等级',
  `headimgurl` varchar(1024) DEFAULT NULL COMMENT '头像地址',
  `live_addr` varchar(512) DEFAULT NULL COMMENT '住址',
  `degree_type` int(4) DEFAULT NULL COMMENT '学历类型，1全日制，2自考，3在职',
  `highest_degree` varchar(50) DEFAULT NULL COMMENT '最高学历',
  `major` varchar(50) DEFAULT NULL COMMENT '专业',
  `school` varchar(512) DEFAULT NULL COMMENT '就读院校',
  `graduate_time` varchar(50) DEFAULT NULL COMMENT '毕业时间',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户信息';

--
-- Table structure for table `video_info`
--

DROP TABLE IF EXISTS `video_info`;
CREATE TABLE `video_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `video_name` varchar(50) DEFAULT NULL COMMENT '视频名称',
  `video_intro` varchar(100) DEFAULT NULL COMMENT '视频说明',
  `user_id` int(11) DEFAULT NULL COMMENT '上次视频的用户ID',
  `agency_id` int(11) DEFAULT NULL COMMENT '机构ID',
  `video_url` varchar(1024) DEFAULT NULL COMMENT '视频路径',
  `image_url` varchar(1024) DEFAULT NULL COMMENT '封面图路径',
  `paper_id` int(11) DEFAULT NULL COMMENT '试卷ID',
  `paper_name` varchar(100) DEFAULT NULL COMMENT '试卷名称',
  `creater_id` int(11) DEFAULT NULL COMMENT '创建人ID',
  `entity_type` int(2) DEFAULT NULL COMMENT '实体类型，',
  `entity_id` int(11) DEFAULT NULL COMMENT '实体ID',
  `entity_name` varchar(100) DEFAULT NULL COMMENT '实体名称',
  `points` varchar(512) DEFAULT NULL COMMENT '知识点ID：多个用,隔开',
  `video_source` varchar(100) DEFAULT 'platform' COMMENT '视频来源：platform——平台服务器，默认值；youku——优酷；tencent——腾讯',
  `video_type` varchar(100) DEFAULT 'mp4' COMMENT '视频类型：mp4——默认值；flv',
  `knowledge_type` int(2) DEFAULT NULL COMMENT '知识点类型，1证件，2资质，3学科',
  `string_field` varchar(100) DEFAULT NULL COMMENT '扩展用-字符串字段',
  `int_field` int(4) DEFAULT NULL COMMENT '扩展用-整型字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='视频信息表';

--
-- Table structure for table `wxuser_info`
--

DROP TABLE IF EXISTS `wxuser_info`;
CREATE TABLE `wxuser_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `openid` varchar(100) DEFAULT NULL COMMENT '微信公众号下用户的唯一标识',
  `subscribe` int(2) DEFAULT NULL COMMENT '关注状态（1是关注，0是未关注），未关注时获取不到其余信息',
  `subscribe_time` varchar(255) DEFAULT NULL COMMENT '用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间',
  `nickname` varchar(255) DEFAULT NULL COMMENT '用户昵称',
  `birthday` varchar(50) DEFAULT NULL COMMENT '生辰',
  `native_place` varchar(100) DEFAULT NULL COMMENT '籍贯',
  `location` varchar(1024) DEFAULT NULL COMMENT '详细地址',
  `sex` int(2) DEFAULT NULL COMMENT '性别 （1是男性，2是女性，0是未知）',
  `country` varchar(100) DEFAULT NULL COMMENT '国家',
  `province` varchar(100) DEFAULT NULL COMMENT '省份',
  `city` varchar(100) DEFAULT NULL COMMENT '城市',
  `phone` varchar(100) DEFAULT NULL COMMENT '用户手机号',
  `identity_no` varchar(100) DEFAULT NULL COMMENT '身份证号',
  `language` varchar(100) DEFAULT NULL COMMENT '用户的语言，简体中文为zh_CN',
  `headimgurl` varchar(1024) DEFAULT NULL COMMENT '头像地址',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='微信用户信息';

INSERT INTO `cmp`.`user_info` (`name`, `nick_name`, `gender`, `phone`, `password`, `user_type`) VALUES ('欧阳宇帆', 'super', '1', '15200844395', 'xupu123', 'A');

INSERT INTO `cmp`.`dictionary_type` (`type_code`, `type_name`) VALUES ('certificateType', '证件类别');
INSERT INTO `cmp`.`dictionary_type` (`type_code`, `type_name`) VALUES ('industry', '所属行业');
INSERT INTO `cmp`.`dictionary_type` (`type_code`, `type_name`) VALUES ('belongType', '所属分类');
INSERT INTO `cmp`.`dictionary_type` (`type_code`, `type_name`) VALUES ('major', '所属专业');
INSERT INTO `cmp`.`dictionary_type` (`type_code`, `type_name`) VALUES ('certificationAuthority', '发证机关');
INSERT INTO `cmp`.`dictionary_type` (`type_code`, `type_name`) VALUES ('profess', '专业');
